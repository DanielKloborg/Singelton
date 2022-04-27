package main;

import java.io.*;
import java.util.*;

public class LogFile {
  private static LogFile inst;
  private static boolean access=true;
  
  public static LogFile instance() {
    if (!access) {
      return null;
    }
    
    if ( inst == null ) {
      inst = new LogFile();
    }
    
    return inst;
  }

  private BufferedWriter output;
  private String filename;

  private LogFile() {
    String filename = "log.txt";
    
    try {
    	output = new BufferedWriter( new FileWriter( filename ) );
    } 
    
    catch ( IOException e ) {
      System.err.println( "Could not open: " + filename );
      access=false;;
    }
  }
  
  public boolean register( String input ) {
    if ( !access ) {
      return false;
    }
    
    String outputting = "[" + new Date() + "] " + input;
    
    try {
      output.write(outputting);
      output.newLine();
    
      return true;
    } 
    catch ( IOException e ) {
      System.err.println( "Could not write to: " + filename );
      access = false;
      return false;
    }
  }
  
  public boolean close() {
    try {
      output.close();
      access = false;
      
      return true;
      
    } 
    catch ( IOException e ) {
      System.err.println( "Could not close: " + filename );
      return false;
    }
  }
}