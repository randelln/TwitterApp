import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JList;

import twitter4j.DirectMessage;
import twitter4j.MediaEntity;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * 
 * @author Randell Naidoo
 * 
 */

public class Main {

	private static twitter4j.Twitter twitter;
	private static gui frame;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main client = new Main();		
		frame = new gui(client);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Twitter Dashboard");
		run();
	
	}
	
	//Update Status
	
	public static void tweet(String tweet)
	{
		try {
			Status sUpdate = twitter.updateStatus(tweet);
			System.out.println("Successfully updated the status to [" + sUpdate.getText() + "].");
			run();
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Subroutine to send a DM to anyone who follows you.
	public static void sendDm(String recipientID, String message)
	{
		try
		{
			DirectMessage sDM = twitter.sendDirectMessage(recipientID, message);
			System.out.println("DM" + " "+ "Successfully sent to [ @"+ recipientID  + "]" );
		}catch(TwitterException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public static void run()
	{
		frame.HashtagDisplay.setText("");
		frame.TweetDisplay.setText("");
		System.out.println("Accessing Twitter Account..");
		// ConfigurationBuilder Class to configure and access twitter API
		ConfigurationBuilder cb = new ConfigurationBuilder();
		ArrayList<String> hashtags = new ArrayList<String>();
		//Access codes to enable authentication to Twitter account
		cb.setDebugEnabled(true)
			.setOAuthConsumerKey("/*Consumer Key*/")
			.setOAuthConsumerSecret("/*Consumer Secret Key*/")
			.setOAuthAccessToken("/Access Token/")
			.setOAuthAccessTokenSecret("/*Access Token Secret Key*/");
			
		System.out.println("Twitter Access Granted!");
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		twitter = tf.getInstance();
		Query query = new Query("#hashtag");
        QueryResult result;
        
		try {
			result = twitter.search(query);
			//Getting twitter feed
			ResponseList<Status> list = twitter.getHomeTimeline();
			
			for(Status status: list)
			{ 
				
				char[] charArray = status.getText().toCharArray();				
				frame.TweetDisplay.append(status.getUser().getName() + " :: " + status.getText()+"\n"+"\n");
			
				//Reading through each tweet to get hashtags
			for(int k = 0; k < charArray.length-1; k++)
			{					
				if(charArray[k] == '#')
				{						
					String temp = "";
					int z = 0;						
					try {
						while(!(charArray[k+z] == ' '))
						{
							temp+= charArray[k+z];
							z++;
						}
						hashtags.add(temp);
					}catch( ArrayIndexOutOfBoundsException e)
					{
						
					}
					
				}
			}
        /*
				// Get images and URL's
				System.out.println(status.getUser().getName() + "--------" + status.getText());
				MediaEntity[] media = status.getMediaEntities();  //status.getMediaEntities(); //get the media entities from the status
						for(MediaEntity m : media)
						{ //search trough your entities
						    System.out.println(m.getMediaURL()); //get your url!
						}
			*/			
			}
			
		} catch (TwitterException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
		Set<String> hs = new HashSet<>();
		hs.addAll(hashtags);
		hashtags.clear();
		hashtags.addAll(hs);
		
		String hashOut = "";
    	for( int s = 0; s < hashtags.size(); s++)
		{
			hashOut+= hashtags.get(s) + "\n";
			//frame.HashtagDisplay.append(hashtags.get(s) );
		}

    	
    	frame.HashtagDisplay.setText(hashOut);
    		
   	
		
		
	}
}
