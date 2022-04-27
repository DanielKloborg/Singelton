package main; 
import javax.swing.*;

public class DebugFrame extends JFrame {
	
private static final long serialVersionUID = 1L;
private static DebugFrame inst=null;
  
  public static DebugFrame instance() {
    if ( inst == null )
      inst = new DebugFrame( "Debug window" );
    
    return inst;
  }
  
  private JTextArea area;
  
  private DebugFrame( String title ) {
    super( title );
    
    area = new JTextArea( 12, 40 );
    getContentPane().add( new JScrollPane( area ) );
    
    pack();
    setVisible( true );
  }
  
  public void message( String msg ) {
    area.append( msg + "\n" );
  }
}