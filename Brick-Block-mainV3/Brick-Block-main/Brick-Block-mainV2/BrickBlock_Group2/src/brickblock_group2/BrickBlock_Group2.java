/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickblock_group2;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class BrickBlock_Group2 {
// Main Method
    public static void main(String[] args) {   
     //method call for opening intro
     openIntro();
     // method call for personal information

     // create string choices for the menu
    String[] choices = {"1. BrickBlock ", "2. Personal Measurements ", 
                    "3. Price calculator", "4. Quit"};

    String menu = "";

    // create the loop with a while loop
while (!menu.equals("4. Quit")) {
    menu = (String) JOptionPane.showInputDialog(null, "<html>Choose A Menu Item:<br><br></html>", "Main Menu", 
                    JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
    if (menu == null) {
        break; 
    }

    // Switch statement for the looped menu
    switch (menu) {
        
        // Method call for project()
        case "1. BrickBlock ":
             project();
            break;
            
            // Method call for userinput()
        case "2. Personal Measurements ":
              userMeasurements();
            break;
            
            //Method call for calculator()
        case "3. Price calculator":
            calculator();
            Receipt();
            break;
            
            // case 4 closes the program
        case "4. Quit":           
            break;
        }
    }

    endingGreeting();
    }

// Open greeting method with validation
  private static void openIntro()
     {
        JOptionPane.showMessageDialog(null, "Hello");
        inputName();
        JOptionPane.showMessageDialog(null, "Nice to meet you " + personName);
        inputOccupation();
        inputPhoneNumber();
        inputEmailAddress();
       
     }
  
  public static String inputName()
  {
      
    personName = JOptionPane.showInputDialog("What is your name?");
    // Name Verification 
   
    if (personName.matches(regex))
    {
       
    }
    else
    {
      JOptionPane.showMessageDialog(null, "Please enter a correct name");  
      inputName();    
    }

    return personName;
  }
  public static String inputOccupation()
  {
    personOccupation = JOptionPane.showInputDialog("What is your occupation ");
    // Name Verification 
   
    if (personOccupation.matches(regex))
    {
       
    }
    else
    {
      JOptionPane.showMessageDialog(null, "Please enter a correct occupation");  
      inputOccupation();    
    }

    return personOccupation;
  }
  public static double inputPhoneNumber()
  {
      personPhoneNumber = Double.parseDouble(JOptionPane.showInputDialog
       (null, "What is your Phone Number:"));
      
    if (personPhoneNumber < 10 || personPhoneNumber < 10 )
    {
      JOptionPane.showMessageDialog(null, "Please enter a phone number");  
      inputPhoneNumber();  
    }
    
    else 
    {
       
    }
   return personPhoneNumber;
  }
  public static String inputEmailAddress()
  {
    personEmail = JOptionPane.showInputDialog("What is your Email:");
    String regexPattern = "^(.+)@(\\S+)$";
    if (personEmail.matches(regexPattern) )
    {
    
    }
    else 
    {
      JOptionPane.showMessageDialog(null, "Please enter a valid Email");  
      inputEmailAddress();
    }
    return personEmail;
  }
 // Closing method
 public static void endingGreeting()
 {
     JOptionPane.showMessageDialog(null, "Thank you for using our application and have a wonderful day!");
 }

    // this is where all the guts of the main project will go
    private static void project() {
        DecimalFormat df2 = new DecimalFormat( "#,###,###,##0.00" );
        JOptionPane.showMessageDialog(null, "We measured all four walls and got an area of " +df2.format(FTCCSURFACEAREA)+" in inches.");
        
        double extra = FTCCADDADENTIONS + FTCCADDCORNERS;
        JOptionPane.showMessageDialog(null, "Then we measured the corners and indentions and got " +df2.format(extra)+" in inches.");
        
        double takeaway = FTCCSUBTRACTWINDOWFRAMES + FTCCSUBTRACTCOMPUTERFRONTFRAME + FTCCSUBTRACTDOORS;       
        JOptionPane.showMessageDialog(null, "Then we measured the windows, doors, and library front and back frames and got " +df2.format(takeaway)+" in inches.");
        
        
        total = FTCCSURFACEAREA + extra - takeaway;
        double bricks = total/modularBrick;
        double brickswaste = bricks * waste;
        JOptionPane.showMessageDialog(null,"Then we added the extra inches to the area then subtract the door and window space and got a total of "
                + ""+df2.format(total)+" in inches.");    
        JOptionPane.showMessageDialog(null,"Which means we will need about "+df2.format(bricks)+" Bricks"); 
        JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(brickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
    }
    
    // extra, will ask user for measurements and will calculate like user measurements, but add retail.
    private static void calculator() {
        DecimalFormat df2 = new DecimalFormat( "#,###,###,##0.00" );
        
    // create string choices for the menu
    String[] choices = {"1. Modular  (7 5/8 x 2 1/4)",
                        "2. Queen    (7 5/8 x 2 3/4)", 
                        "3. Closure  (7 5/8 x 3 5/8)",
                        "4. Standard (8 x 2 1/4)",
                        "5. Jumbo    (8 x 2 3/4)",
                        "6. King     (9 5/8 x 2 5/8)",
                        "7. Roman    (11 5/8 x 1 5/8)",
                        "8. Norman   (11 5/8 x 2 1/4)",                    
                        "9. Utility  (11 5/8 x 3 5/8)",
                        "10. Quit"};

    String menu = "";
    
    // create the loop with a while loop
while (!menu.equals("10. Quit")) {
    menu = (String) JOptionPane.showInputDialog(null, "<html>Which Brick are you going to use:<br><br></html>", "Bricks", 
                    JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
    if (menu == null) {
        break; 
    }

    // Switch statement for the looped menu
    switch (menu) {
        
        // modular brick
        case "1. Modular  (7 5/8 x 2 1/4)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double mbricks = total/modularBrick;
           double mbrickswaste = mbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(mbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(mbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
           bricksNeeded = mbricks + mbrickswaste;
           morterCount = bricksNeeded / morterPreBags;
           morterPrice = morterCount * morterBagPrice;
           brickBundles = bricksNeeded / brickBundle;
           brickCost = brickBundles * brickPrice;
           priceOfProject = brickCost + morterPrice;
           
           menu = "10. Quit";
           break;
                
            
        // queen brick    
        case "2. Queen    (7 5/8 x 2 3/4)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double qbricks = total/queenBrick;
           double qbrickswaste = qbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(qbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(qbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
           bricksNeeded = qbricks + qbrickswaste;
           morterCount = bricksNeeded / morterPreBags;
           morterPrice = morterCount * morterBagPrice;
           brickBundles = bricksNeeded / brickBundle;
           brickCost = brickBundles * brickPrice;
           priceOfProject = brickCost + morterPrice; 
           
           menu = "10. Quit";
           break;
            
            
        // closure brick    
        case "3. Closure  (7 5/8 x 3 5/8)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double cbricks = total/closureBrick;
           double cbrickswaste = cbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(cbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(cbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
           bricksNeeded = cbricks + cbrickswaste;
           morterCount = bricksNeeded / morterPreBags;
           morterPrice = morterCount * morterBagPrice;
           brickBundles = bricksNeeded / brickBundle;
           brickCost = brickBundles * brickPrice;
           priceOfProject = brickCost + morterPrice; 
           
           menu = "10. Quit";
           break;
            
            
        // standard brick    
        case "4. Standard (8 x 2 1/4)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double sbricks = total/standardBrick;
           double sbrickswaste = sbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(sbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(sbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
           bricksNeeded = sbricks + sbrickswaste;
           morterCount = bricksNeeded / morterPreBags;
           morterPrice = morterCount * morterBagPrice;
           brickBundles = bricksNeeded / brickBundle;
           brickCost = brickBundles * brickPrice;
           priceOfProject = brickCost + morterPrice;
           
           menu = "10. Quit";
           break;
            
            
        // jumbo brick    
        case "5. Jumbo    (8 x 2 3/4)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double jbricks = total/jumboBrick;
           double jbrickswaste = jbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(jbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(jbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
           bricksNeeded = jbricks + jbrickswaste;
           morterCount = bricksNeeded / morterPreBags;
           morterPrice = morterCount * morterBagPrice;
           brickBundles = bricksNeeded / brickBundle;
           brickCost = brickBundles * brickPrice;
           priceOfProject = brickCost + morterPrice;
           
           menu = "10. Quit";
           break;
        
            
        // king brick    
        case "6. King     (9 5/8 x 2 5/8)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double kbricks = total/kingBrick;
           double kbrickswaste = kbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(kbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(kbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
           bricksNeeded = kbricks + kbrickswaste;
           morterCount = bricksNeeded / morterPreBags;
           morterPrice = morterCount * morterBagPrice;
           brickBundles = bricksNeeded / brickBundle;
           brickCost = brickBundles * brickPrice;
           priceOfProject = brickCost + morterPrice;
           
           menu = "10. Quit";
           break;
            
            
        // roman brick    
        case "7. Roman    (11 5/8 x 1 5/8)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double rbricks = total/romanBrick;
           double rbrickswaste = rbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(rbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(rbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
           bricksNeeded = rbricks + rbrickswaste;
           morterCount = bricksNeeded / morterPreBags;
           morterPrice = morterCount * morterBagPrice;
           brickBundles = bricksNeeded / brickBundle;
           brickCost = brickBundles * brickPrice;
           priceOfProject = brickCost + morterPrice;
           
           menu = "10. Quit";
           break;
            
            
        // norman brick    
        case "8. Norman   (11 5/8 x 2 1/4)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double nbricks = total/normanBrick;
           double nbrickswaste = nbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(nbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(nbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
           bricksNeeded = nbricks + nbrickswaste;
           morterCount = bricksNeeded / morterPreBags;
           morterPrice = morterCount * morterBagPrice;
           brickBundles = bricksNeeded / brickBundle;
           brickCost = brickBundles * brickPrice;
           priceOfProject = brickCost + morterPrice;
           
           menu = "10. Quit";
           break;
            
            
        // utility brick    
        case "9. Utility  (11 5/8 x 3 5/8)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double ubricks = total/utilityBrick;
           double ubrickswaste = ubricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(ubricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(ubrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
           bricksNeeded = ubricks + ubrickswaste;
           morterCount = bricksNeeded / morterPreBags;
           morterPrice = morterCount * morterBagPrice;
           brickBundles = bricksNeeded / brickBundle;
           brickCost = brickBundles * brickPrice;
           priceOfProject = brickCost + morterPrice;
           
           menu = "10. Quit";
           break;
            
        case "10. Quit":
            menu = "10. Quit";
            break;         
        }
    }
    }
       
    // get user area and devide by brick of choice
    private static void userMeasurements() {
    DecimalFormat df2 = new DecimalFormat( "#,###,###,##0.00" );
           // create string choices for the menu
    String[] choices = {"1. Modular  (7 5/8 x 2 1/4)",
                        "2. Queen    (7 5/8 x 2 3/4)", 
                        "3. Closure  (7 5/8 x 3 5/8)",
                        "4. Standard (8 x 2 1/4)",
                        "5. Jumbo    (8 x 2 3/4)",
                        "6. King     (9 5/8 x 2 5/8)",
                        "7. Roman    (11 5/8 x 1 5/8)",
                        "8. Norman   (11 5/8 x 2 1/4)",                    
                        "9. Utility  (11 5/8 x 3 5/8)",
                        "10. Quit"};

    String menu = "";

    // create the loop with a while loop
while (!menu.equals("10. Quit")) {
    menu = (String) JOptionPane.showInputDialog(null, "<html>Which Brick are you going to use:<br><br></html>", "Bricks", 
                    JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
    if (menu == null) {
        break; 
    }

    // Switch statement for the looped menu
    switch (menu) {
        
        // modular brick
        case "1. Modular  (7 5/8 x 2 1/4)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double mbricks = total/modularBrick;
           double mbrickswaste = mbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(mbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(mbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
            break;
                
            
        // queen brick    
        case "2. Queen    (7 5/8 x 2 3/4)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double qbricks = total/queenBrick;
           double qbrickswaste = qbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(qbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(qbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
            break;
            
            
        // closure brick    
        case "3. Closure  (7 5/8 x 3 5/8)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double cbricks = total/closureBrick;
           double cbrickswaste = cbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(cbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(cbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
            break;
            
            
        // standard brick    
        case "4. Standard (8 x 2 1/4)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double sbricks = total/standardBrick;
           double sbrickswaste = sbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(sbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(sbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
            break;
            
            
        // jumbo brick    
        case "5. Jumbo    (8 x 2 3/4)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double jbricks = total/jumboBrick;
           double jbrickswaste = jbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(jbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(jbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
            break;
        
            
        // king brick    
        case "6. King     (9 5/8 x 2 5/8)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double kbricks = total/kingBrick;
           double kbrickswaste = kbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(kbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(kbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
            break;
            
            
        // roman brick    
        case "7. Roman    (11 5/8 x 1 5/8)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double rbricks = total/romanBrick;
           double rbrickswaste = rbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(rbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(rbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
            break;
            
            
        // norman brick    
        case "8. Norman   (11 5/8 x 2 1/4)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double nbricks = total/normanBrick;
           double nbrickswaste = nbricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(nbricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(nbrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
            break;
            
            
        // utility brick    
        case "9. Utility  (11 5/8 x 3 5/8)":
            try{
               total = Double.parseDouble(JOptionPane.showInputDialog(" What is the area of your project in Inches? "));
       }
       catch(NumberFormatException e){
           //error
        JOptionPane.showMessageDialog(null,"Error, not a number. Please try again.");
       }
           double ubricks = total/utilityBrick;
           double ubrickswaste = ubricks * waste; 
           JOptionPane.showMessageDialog(null, "This is the Aproximate number of bricks you will need "+df2.format(ubricks));
           JOptionPane.showMessageDialog(null, "Make sure you get extra " +df2.format(ubrickswaste)+" bricks, which we calculated a 10 percent waste, for breakage");
            break;
            
                       
        case "10. Quit":
            break;
        }
    }}
    
    // creates a receipt
    private static void Receipt() {
         try
    {
         try (FileWriter myOutPutFile = new FileWriter(personEmail + ".txt")) {
              DecimalFormat df2 = new DecimalFormat( "#,###,###,##0.00" );
              myOutPutFile.write("Name: " + personName  + "\n");
              myOutPutFile.write("Occupation: " + personOccupation + "\n");
              myOutPutFile.write("Email Address: " + personEmail + "\n");
              myOutPutFile.write("You need " + df2.format(bricksNeeded) + " Bricks " 
                      + "to complete the project" + "\n");
              myOutPutFile.write("It costs $500, for a bundle of 1,000 bricks \n");
              myOutPutFile.write("That gives you " + df2.format(brickBundles) + " Bundles of Bricks \n");
              myOutPutFile.write("You will also need " + df2.format(morterCount) + " Bags of PreMixed Cement \n");
              myOutPutFile.write("Which will cost $" + df2.format(morterPrice) + " \n");
              myOutPutFile.write("Meaning the Total Price for your Job is around: $" + df2.format(priceOfProject)
              + " dollars." +"\n");
              myOutPutFile.write("Thank you so much for Using Our System!");
              
         }
        DecimalFormat df2 = new DecimalFormat( "#,###,###,##0.00" );
        JOptionPane.showMessageDialog(null, "Name: " + personName + "\n" +
                "Occupation: " + personOccupation + "\n" + "Email Address: " 
                + personEmail + "\n" + "You need " + df2.format(bricksNeeded) 
                + " Bricks "    + "to complete the project." + "\n" 
                + "It costs $500, for a bundle of 1,000 bricks. \n"
        + "That gives you " + df2.format(brickBundles) + " Bundles of Bricks." + 
                "\n" + "You will also need " + df2.format(morterCount)
                + " Bags of PreMixed Cement \n"
        + "Which will cost $" + df2.format(morterPrice) + ". \n"
       + "Meaning the Total Price for your Job is around: $" + df2.format(priceOfProject)
              + " dollars." +"\n" +
        "Thank you so much for Using Our System!");
        
    
    }
     catch (IOException e)
     {
       JOptionPane.showMessageDialog(null, "An error occured");
     }
    }
// Global Variables for bricks (width and height and area)

private static final double MODULARWIDTH = 2.25;
private static final double MODULARHEIGHT = 7.625;
public static double modularBrick = MODULARWIDTH * MODULARHEIGHT;

private static final double QUEENWIDTH = 2.75;
private static final double QUEENHEIGHT = 7.625;
public static double queenBrick = QUEENWIDTH * QUEENHEIGHT;

private static final double CLOSUREWIDTH = 3.625;
private static final double CLOSUREHEIGHT = 7.625;
public static double closureBrick = CLOSUREWIDTH * CLOSUREHEIGHT;

private static final double STANDARDWIDTH = 2.25;
private static final double STANDARDHEIGHT = 8;
public static double standardBrick = STANDARDWIDTH * STANDARDHEIGHT;

private static final double JUMBOWIDTH = 2.75;
private static final double JUMBOHEIGHT = 8;
public static double jumboBrick = JUMBOWIDTH * JUMBOHEIGHT;

private static final double KINGWIDTH = 2.625;
private static final double KINGHEIGHT = 9.625;
public static double kingBrick = KINGWIDTH * KINGHEIGHT;

private static final double ROMANWIDTH = 1.625;
private static final double ROMANHEIGHT = 11.625;
public static double romanBrick = ROMANWIDTH * ROMANHEIGHT;

private static final double NORMANWIDTH = 2.25;
private static final double NORMANHEIGHT = 11.625;
public static double normanBrick = NORMANWIDTH * NORMANHEIGHT;

private static final double UTILITYWIDTH = 3.625;
private static final double UTILITYHEIGHT = 11.625;
public static double utilityBrick = UTILITYWIDTH * UTILITYHEIGHT;

//Global FTCC Variables
private static final double FTCCSURFACEAREA = 492072;
private static final double FTCCSUBTRACTWINDOWFRAMES = 16280;
private static final double FTCCSUBTRACTCOMPUTERFRONTFRAME = 15136;
private static final double FTCCSUBTRACTDOORS = 56320;
private static final double FTCCADDADENTIONS = 21917;
private static final double FTCCADDCORNERS = 23230;

// Global Variables for the program
public static double priceOfProject = 0;
public static double bricksNeeded= 0;

public static String personName = "";
public static String personEmail = "";
public static String personOccupation = "";
public static double personPhoneNumber = 0; 
public static double total;  
// for broken bricks etc.
public static double waste = .10;
// price in the morter
public static double morterPreBags = 36;
public static double morterCount = 0;
public static double morterBagPrice = 7.25;
public static double morterPrice = 0;
// price in for bundles of 1000
public static double brickBundle = 1000;
public static double brickBundles = 0;
public static double brickPrice = 500;
public static double brickCost = 0;
public static String regex = "^[a-zA-Z]+$";
}


