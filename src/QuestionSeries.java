
/**
 *
 * @author WaLiD
 * In this class all the questions will be checked
 */
class QuestionSeries{
static String info ="Java Online Test Week  \n \nINSTRUCTIONS:\nThere are 25 questions in this test and 25 minutes to complete them all.\nThe finish button is highlighted in blue when you reach the end of the test. \nClicking the finish button will display the results with the correct answers marked in light red.  \n \nThe timecounter  begins when you click on the 'start' button \n \nBest of luck!\n";
//Storeing all the questions in the questions array
static String []question ={"Question 1:\nWhat does RAM stand for?\n",
"Question 2:\n What does CPU stand for?\n",
"Question 3:\n Name two input devices:\n",
"Question 4:\n Which data storage device is faster? \n",
"Question 5:\n What popular freeware browser was developed by Google\n",
"Question 6:\n What does HTML stand for? \n",
"Question 7:\n How Many bits are in a byte? \n",
"Question 8:\n What dose IDE stand for? \n",
"Question 9:\n What was the first cryptocurrency that was created in 2009? \n",
"Question 10:\n What popular free proxy, originally developed by the US Navy, is used to defend yourself from traffic analysis and provide anonymity online\n",
"Question 11:\n What popular linux distro, used by Edward Snowden, aims at preserving your privacy and anonymity?\n",
"Question 12:\n What cable connects a cable modem to a wireless router? \n",
"Question 13:\n What program allows an Apple computer to run Microsoft Windows?\n",
"Question 14:\n How many layers are in the OSI model?\n",
"Question 15:\n What is phishing?\n",
"Question 16:\n What is BIOS short for?\n",
"Question 17:\n What was the original Apple computers logo?\n",
"Question 18:\n What is the result of this program?\n\nclass TryJavaApp{ \n  static float f;\n  public static void main(String[] ar){\n    int Number = 5;\n    f = 1.25;    \n    System.out.println(f*4); \n  } \n}\n",
"Question 19:\n What is the result of this program?\n\nclass JavaApp{ \n  static float f;\n  public static void main(String[] ar){\n    int Num = 2;\n    f = (float)1.25 * 2;    \n    System.out.println(f * Num); \n  } \n}\n",
"Question 20:\n Which of the following will not help your computer's security?\n",
"Question 21:\n What is the result of this program?\n\nclass JavaApp{ \n  public static void main(String[] a){\n  double d = 1.56789;\n    long num = Math.round(d);\n    System.out.println(num); \n  } \n}\n",
"Question 22:\n Which of the following is an example of Binary?\n",
"Question 23:\n Which of the following is not a network protocol?\n",
"Question 24:\n What is the result of this program?\n\nclass TryApp{ \npublic static void main(String[] arg){\n    int num = 4;\n    num = (num + 4/2) % num+1;\n    System.out.println(num); \n  } \n}\n",
"Question 25:\n What is the result?\n\nclass MyApp{ \n  public static void main(String[] ar){\n    for(int i=0; i<3; i++)\n      for(int j=1; j<3; j++)\n        System.out.print(j+i+\",\"); \n  } \n}\n"
};

//Storing all possible answer, each questions given 4 options
static String [][]answers ={{"Radio Analyzing memory\n","Random Access Memory \n","Random Access Megabits\n","radio access megabits\n"},
                            {"carpel punishment user\n"," \ncentral perusing user\n"," \ncentral processing unit\n"," \ncentral preamble unit\n"},
                            {" \nkeyboard, scanner\n","monitor, printer\n","apps,servers\n","fingers,eyes\n"},
                            {" \nExternal Drive\n","\nFlash Drive\n"," \nHard Drive\n"," \nSolid State Drive\n"},
                            {" \nFirefox\n"," \nIE\n"," \nGoogle ChromeCast\n"," \nGoogle Chrome\n"},
                            {" \nHyperText Markup Language\n"," \nExtensionText Markup Language\n"," \nHydrolic Tension Made Pressure \n","\n none of them\n"},
                            {" \n16\n"," \n32\n"," \n8\n"," \n64\n"},
                            {" \nInternet Devlopment Environment\n"," \nIntegrated Development Enviroment\n"," \nISO Development Enterprise\n"," \nInternational Development Enterprise\n"},                        
                            {" \nBitcoins\n"," \nBitbucket\n"," \nGithub\n"," \nSSL\n"},                       
                            {" \nNorton\n"," \nTor\n"," \nAVG\n"," \nSSL\n"},
                            {" \nUbuntu\n"," \nLinux\n"," \nMac OS\n"," \nTails OS\n"},                         
                            {" \nCAT5 cable\n"," \nCoaxial cable\n"," \nRj-11\n"," \nNo wire\n"},                    
                            {" \nBonjour\n"," \nBoot camp\n"," \niBoot\n"," \nNone of the above\n"},
                            {"\n4\n"," \n8\n"," \n7\n"," \n6\n"},                            
                            {" \nA computer virus\n"," \nA corrupt website\n"," \nA distribution of spam\n"," \nAn identity theft scheme\n"},           
                            {" \nNot short for anything\n"," \nBasic Input/Output System\n"," \nBinary Input/Output System\n"," \nBus Input/Output System\n"},            
                            {" \nRainbow apple\n"," \nRainbow apple with a bite\n"," \nWhite apple\n"," \nSir Isaac Newton under an apple tree\n"},
                            {" \nError float f is not initialised\n"," \noutput: 5\n"," \noutput: 5.0\n"," \nError, this is not a valid way to initialise a float type variable\n"},
                            {" \n4.0\n"," \n5\n"," \n5.0\n"," \nError, it will not compile\n"},
                            {" \nFirewall\n"," \nVLAN\n"," \nGood Password\n"," \nUpdate software\n"},
                            {" \n1\n"," \n2\n"," \n3\n"," \nError, number is out of range\n"},   
                            {"\n123\n"," 1\n7B\n"," \n111 1011\n"," \nAll of the above\n"},
                            {"\n HTTP \n"," \nPSI\n"," \nPIM\n"," \nRIP\n"},
                            {" \n1\n"," \n3\n"," \n4\n"," \n6\n"},
                            {"1,2,2,3,3,4\n","1,2,3,3,4,6\n","1,2,3,4\n"," \n0,1,1,2,2,3,3,4\n"} };

static int []n = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
static String []choice= {"2","3","1","4","4","1","3","2","1","2","4","1","2","3","4","4","4","4","3","2","2","3","2","1","1"};
static int tally = choice.length;
static String testtitle="Computer Information Association Quiz Bowl";
static int timeLimit =10;
static int passMark = 15;
}
