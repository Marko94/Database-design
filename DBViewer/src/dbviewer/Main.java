package dbviewer;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.alee.laf.WebLookAndFeel;
import com.alee.laf.label.WebLabelStyle;
import com.alee.laf.panel.WebPanelStyle;
import com.alee.laf.tabbedpane.WebTabbedPaneStyle;
import com.alee.laf.toolbar.WebToolBarStyle;
import com.alee.managers.CoreManagers;

public class Main {
	public static void main(String[] args){
		staviTemu();
		//uzimanje instance
		DBViewer.getInstance();
	}
	
	public static void staviTemu(){
		//podesavanje look and feel-a
		Image  img = new ImageIcon("temp.png").getImage();
		
		WebLookAndFeel.install ();
		CoreManagers.initialize ();
		
		WebPanelStyle.backgroundColor = new Color(0,196,255);	
		WebTabbedPaneStyle.bottomBg = new Color(190,242,255);
		WebTabbedPaneStyle.selectedTopBg = new Color(0,196,255);
		WebTabbedPaneStyle.selectedBottomBg = new Color(0,196,255);
		WebTabbedPaneStyle.contentBorderColor = new Color(0,196,255);
		WebLabelStyle.backgroundColor = new Color(0,0,0);
		WebToolBarStyle.topBgColor = new Color(190,242,255);
		WebToolBarStyle.topBgColor = new Color(0,196,255);
		
		
		
		/*try 
		  {
		   for(LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
		    if(info.getName().equals("Nimbus"))
		     UIManager.setLookAndFeel(info.getClassName());
		   	 
		   	 
		   	 Image STop = new ImageIcon("ScrollUnpressedTop.png").getImage();
		   	 Image SMid = new ImageIcon("ScrollUnpressedMid.png").getImage();
		   	 Image SBot = new ImageIcon("ScrollUnpressedBot.png").getImage();
		   	 Image UTop = new ImageIcon("ScrollPressedTop.png").getImage();
   			 Image UMid = new ImageIcon("ScrollPressedMid.png").getImage();
   			 Image UBot = new ImageIcon("ScrollPressedBot.png").getImage();
   			 Image button = new ImageIcon("FinalnoDugmePressed.png").getImage();
   			 Image buttonPressed = new ImageIcon("FinalnoDugmeUnpressed.png").getImage();
   			 Image TAselected = new ImageIcon("TAselected.png").getImage();
   			 Image TAmouseOver = new ImageIcon("TAmouseOver.png").getImage();
   			 Image TApressed = new ImageIcon("TAmouseOver.png").getImage();
   			 Image TAdisabled = new ImageIcon("TAdisabled.png").getImage();
   			 Image selected = new ImageIcon("selected.png").getImage();
   			 Image selectedAndClicked = new ImageIcon("selected+clicked.png").getImage();
   			 Image unselected = new ImageIcon("unselected.png").getImage();
   			 
		   	 UIManager.put("nimbusBase", new Color(140, 140, 140)); 
		   	 UIManager.put("control", new Color(240, 240, 240));
		   	 UIManager.put("nimbusSelectedText", new Color(0, 0, 0));
		   	 UIManager.put("ToolBar.background", new Color(0, 0, 250));
		   	 UIManager.put("ScrollBar.disabled", new Color(0, 0, 0));
		   	 UIManager.put("ScrollBar.trackForeground", new ColorUIResource(new Color(57,57,57)));
		   	
		   	 UIManager.getLookAndFeelDefaults().put("ScrollBar.minimumThumbSize", new Dimension(90, 42));
		    
	    	 UIManager.put("ScrollBar:\"ScrollBar.button\"[Enabled].foregroundPainter", new Painter<JComponent>() {

		    	@Override
	    		public void paint(Graphics2D g, JComponent object, int width, int height) {
		    		g.drawImage(button, 0, 0, width+22, height, null);
			    }
		     });
		   	
		   	 UIManager.put("ScrollBar:\"ScrollBar.button\"[MouseOver].foregroundPainter", new Painter<JComponent>() {

				@Override
				public void paint(Graphics2D g, JComponent object, int width, int height) {
					g.drawImage(buttonPressed, 0, 0, width+22, height, null);				
				}
			 });
		   	
			 UIManager.put("ScrollBar:\"ScrollBar.button\"[Pressed].foregroundPainter", new Painter<JComponent>() {

				@Override
				public void paint(Graphics2D g, JComponent object, int width, int height) {
					g.drawImage(buttonPressed, 0, 0, width+22, height, null);				
				}
			 });
		   	 UIManager.getLookAndFeelDefaults().put("DesktopPane[Enabled].backgroundPainter", new Painter<JComponent>() {

				@Override
				public void paint(Graphics2D g, JComponent object, int width, int height) {
					g.drawImage(img, 0, 0, width, height, null);	
				}
			 }); 

		   	 UIManager.getLookAndFeelDefaults().put("MenuBar:Menu[Selected].backgroundPainter", new Painter<JComponent>(){
                @Override
                public void paint(Graphics2D g, JComponent object, int width, int height) {
                    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g.setColor(new Color(90, 90, 90));
                    g.fillRect(0, 0, width, height);
                }
             });	 
		   	 
	    	 UIManager.getLookAndFeelDefaults().put("ScrollBar:ScrollBarThumb[Enabled].backgroundPainter", new Painter<JComponent>() {
	   		     @Override
	   		     public void paint(Graphics2D g, JComponent object, int width, int height) {
		   		     g.drawImage(UTop, 0, 0, 21, 15, null);
		   		     g.drawImage(UMid, 21, 0, width - 42, 15, null);
		   		     g.drawImage(UBot, width - 21, 0, 21, 15, null);
	   		     }
   		    });
		   		  
		    UIManager.getLookAndFeelDefaults().put("ScrollBar:ScrollBarThumb[MouseOver].backgroundPainter", new Painter<JComponent>() {
	   		     @Override
	   		     public void paint(Graphics2D g, JComponent object, int width, int height) {
		   		     g.drawImage(STop, 0, 0, 21, 15, null);
		   		     g.drawImage(SMid, 21, 0, width - 42, 15, null);
		   		     g.drawImage(SBot, width - 21, 0, 21, 15, null);
	   		     }
   		    });
		    
		    
		    
		    UIManager.put("TabbedPane:TabbedPaneTabArea[Enabled].backgroundPainter", new Painter<JComponent>() {

		    	@Override
	    		public void paint(Graphics2D g, JComponent object, int width, int height) {
		    		g.drawImage(TAselected, 0, 0, width, height, null);
			    }
		     });

		    UIManager.put("TabbedPane:TabbedPaneTab[Disabled].backgroundPainter", new Painter<JComponent>() {

		    	@Override
	    		public void paint(Graphics2D g, JComponent object, int width, int height) {
		    		g.drawImage(unselected, 0, 0, width, height, null);
			    }
		     });
		    
		    UIManager.put("TabbedPane:TabbedPaneTab[Enabled].backgroundPainter", new Painter<JComponent>() {

		    	@Override
	    		public void paint(Graphics2D g, JComponent object, int width, int height) {
		    		g.drawImage(unselected, 0, 0, width, height, null);
			    }
		     });

		    UIManager.put("TabbedPane:TabbedPaneTab[Selected].backgroundPainter", new Painter<JComponent>() {

		    	@Override
	    		public void paint(Graphics2D g, JComponent object, int width, int height) {
		    		g.drawImage(selected, 0, 0, width, height, null);
			    }
		     }); 
		    
		    UIManager.put("TabbedPane:TabbedPaneTab[Focused].backgroundPainter", new Painter<JComponent>() {

		    	@Override
	    		public void paint(Graphics2D g, JComponent object, int width, int height) {
		    		g.drawImage(selectedAndClicked, 0, 0, width, height, null);
			    }
		     });
		    
		    UIManager.put("TabbedPane:TabbedPaneTab[Disabled+Selected].backgroundPainter", new Painter<JComponent>() {

		    	@Override
	    		public void paint(Graphics2D g, JComponent object, int width, int height) {
		    		g.drawImage(selectedAndClicked, 0, 0, width, height, null);
			    }
		     });
		    
		    UIManager.put("TabbedPane:TabbedPaneTab[Enabled+MouseOver].backgroundPainter", new Painter<JComponent>() {

		    	@Override
	    		public void paint(Graphics2D g, JComponent object, int width, int height) {
		    		g.drawImage(selectedAndClicked, 0, 0, width, height, null);
			    }
		     });
		    
		    UIManager.put("TabbedPane:TabbedPaneTab[Enabled+Pressed].backgroundPainter", new Painter<JComponent>() {

		    	@Override
	    		public void paint(Graphics2D g, JComponent object, int width, int height) {
		    		g.drawImage(unselected, 0, 0, width, height, null);
			    }
		     });
		*/    
		/*    UIManager.put("TabbedPane:TabbedPaneTab[Focused+Selected].backgroundPainter", new Painter<JComponent>() {

		    	@Override
	    		public void paint(Graphics2D g, JComponent object, int width, int height) {
		    		g.drawImage(selected, 0, 0, width, height, null);
			    }
		     });
		*/    
		  /*  UIManager.put("TabbedPane:TabbedPaneTab[Pressed+Selected].backgroundPainter", new Painter<JComponent>() {

		    	@Override
	    		public void paint(Graphics2D g, JComponent object, int width, int height) {
		    		g.drawImage(selected, 0, 0, width, height, null);
			    }
		     });
		   */ 
		/*    UIManager.put("TabbedPane:TabbedPaneTab[MouseOver+Selected].backgroundPainter", new Painter<JComponent>() {

		    	@Override
	    		public void paint(Graphics2D g, JComponent object, int width, int height) {
		    		g.drawImage(selected, 0, 0, width, height, null);
			    }
		     });
		    
		    UIManager.put("TabbedPane:TabbedPaneTab[Focused+MouseOver+Selected].backgroundPainter", new Painter<JComponent>() {

		    	@Override
	    		public void paint(Graphics2D g, JComponent object, int width, int height) {
		    		g.drawImage(selected, 0, 0, width, height, null);
			    }
		     });
		    
 		    UIManager.put("TabbedPane:TabbedPaneTab[Focused+Pressed+Selected].backgroundPainter", new Painter<JComponent>() {

		    	@Override
	    		public void paint(Graphics2D g, JComponent object, int width, int height) {
		    		g.drawImage(selectedAndClicked, 0, 0, width, height, null);
			    }
		     });	    
 		   
		   	UIManager.put("nimbusSelectionBackground", new Color(235, 235, 235));	   	
		  } 
	    catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) 
		  {
			  	e.printStackTrace();
		  }
		  */
	}
}