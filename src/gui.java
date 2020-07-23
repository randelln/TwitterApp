import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * @author Randell Naidoo
 * 
 */

public class gui extends JFrame
{
	//GUI Variables
	private JPanel DMPanel;
    private JTabbedPane DMTab;
    public JTextArea HashtagDisplay;
    private JPanel HomePanel;
    public JTextArea TweetDisplay;
    private JButton btnTweet;
    private JMenu jMenu3;
    private JMenuItem jMenuItem1;
    private JPanel jPanel1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane4;
    public JLabel lblHashtags;
    private JLabel lblTimeline;
    private JLabel lblUpdSt;
    private JTextField txtStatusUpd;
    
    private javax.swing.JLabel lblSend;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JTextField txtWho;
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollPane jScrollPane1;
	
    public gui(Main client) {
    	//Initializing GUI Components
        initComponents();
        
       //Button to post status update 
        btnTweet.addActionListener(new ActionListener(){                                                                          

			@Override
			public void actionPerformed(ActionEvent a) {
				
				String tweet = txtStatusUpd.getText();
				
				Main.tweet(tweet);
				
				
				
			}
    		
    	});
        
        btnSend.addActionListener(new ActionListener()
        		{

					@Override
					public void actionPerformed(ActionEvent arg0) 
					{
						// TODO Auto-generated method stub
						String rcpID = txtWho.getText();
						String msg = txtMessage.getText();
						
						Main.sendDm(rcpID, msg);
						
					}
        	
        		}
        		
        		);
        
        
        
    }

   //Void to set up GUI components
    private void initComponents() {

        jMenu3 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jPanel1 = new JPanel();
        DMTab = new JTabbedPane();
        HomePanel = new JPanel();
        lblUpdSt = new JLabel();
        txtStatusUpd = new JTextField();
        btnTweet = new JButton();
        lblHashtags = new JLabel();
        lblTimeline = new JLabel();
        jScrollPane2 = new JScrollPane();
        HashtagDisplay = new JTextArea();
        jScrollPane4 = new JScrollPane();
        TweetDisplay = new JTextArea();
        DMPanel = new JPanel();
        txtMessage = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        lblSend = new javax.swing.JLabel();
        txtWho = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DMTab.setBackground(new java.awt.Color(51, 204, 255));

        HomePanel.setBackground(new java.awt.Color(0, 204, 255));

        lblUpdSt.setText("Update Status:");

        txtStatusUpd.setText("What are you doing?");

        btnTweet.setText("Tweet");

        lblHashtags.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        lblHashtags.setText("Recent Hashtags:");
        lblHashtags.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblTimeline.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        lblTimeline.setText("Home Timeline:");
        lblTimeline.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        HashtagDisplay.setColumns(20);
        HashtagDisplay.setRows(5);
        jScrollPane2.setViewportView(HashtagDisplay);

        TweetDisplay.setColumns(20);
        TweetDisplay.setRows(5);
        jScrollPane4.setViewportView(TweetDisplay);

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(HomePanelLayout.createSequentialGroup()
                            .addComponent(lblUpdSt)
                            .addGap(18, 18, 18)
                            .addComponent(txtStatusUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23)
                            .addComponent(btnTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(HomePanelLayout.createSequentialGroup()
                            .addComponent(lblTimeline, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(362, 362, 362)))
                    .addGroup(HomePanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomePanelLayout.createSequentialGroup()
                        .addComponent(lblHashtags, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addContainerGap())
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUpdSt)
                    .addComponent(txtStatusUpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTweet))
                .addGap(22, 22, 22)
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHashtags)
                    .addComponent(lblTimeline))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        DMTab.addTab("Home", HomePanel);

        DMPanel.setBackground(new java.awt.Color(51, 204, 255));

        lblSend.setText("TO:");

        //txtWho.setText("@");
        

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        jScrollPane1.setViewportView(txtMessage);

        btnSend.setText("Send ");

        javax.swing.GroupLayout DMPanelLayout = new javax.swing.GroupLayout(DMPanel);
        DMPanel.setLayout(DMPanelLayout);
        DMPanelLayout.setHorizontalGroup(
            DMPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DMPanelLayout.createSequentialGroup()
                .addGroup(DMPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DMPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DMPanelLayout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(lblSend, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtWho, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(DMPanelLayout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        DMPanelLayout.setVerticalGroup(
            DMPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DMPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DMPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSend)
                    .addComponent(txtWho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        DMTab.addTab("Direct Messages", DMPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DMTab)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DMTab)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
	
	
}
