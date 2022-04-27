package main;

public class Assignment2 {

	public static void main(String[] args) {
	    for ( int i=0; i<10; i++ ) {
	        LogFile.instance().register( "Event " + i );
	    }
	    
	    LogFile.instance().close();
	}
}
