# ** _BMI APP_ ** 

# **Contexts->**
1. Project Description
2. Activites and Layout
3. Login Activity
   - User Login activity
   - Button disabilty(Login button)
   - Toast PopUP
   
4. BMI activity
   - Catch the values from EditText view
   - TypeCasting and Parse conversion(JAVA)
   - Showing result in a TextView 
   - Exception handling

&nbsp;
&nbsp;

# **Pre Requisite:**
1. ## Basic understanding about android-studio
   >[>Android studio](https://developer.android.com)
2. ## Understanding of activity
    >[>Acitivity](https://developer.android.com/s/results/?q=activity)  
3. ## Basic understanding of android `widget-classes`
    >[>Widget classes](https://developer.android.com/guide/topics/appwidgets) 
4. ## Basic of Layout(```Constraint layout must```)
    >[>Layout](https://developer.android.com/s/results/?q=layout)

5. ## Basic of Intent
    > [>Intent](https://developer.android.com/s/results/?q=intent)
6. ## basic of Listener 
    >[>Listener](https://developer.android.com/s/results/?q=listener)
8. ## Perfect knowledge about `JAVA` or `KOTLIN`
 
&nbsp;

&nbsp;

&nbsp;


---
- _Project Desc_ :

     - It is my first android project using android studio and java. As I follow a strategy -> Learning with Creating projects so, I have created the project to visualise some of the fundamentals of android studio.

     - There are two activities in the app. One is for login activity in order to understand the basic of Login activities and Button activity. The other activity is the calculator where data is taken from EditText view and calculated BMI by the given data for basic understand of the java fucntionality in android studio.
---

---
- _Activites and Layout_ :
  
    - Login process will startup after the Login button being clicked by the user. The action can be setting up by using the `Listener`
    ```
    Login=(Button)findViewById(R.id.login);  ///initialise Login Button///

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            
            _Action can be set_

        });
    ```
    ![](https://github.com/AsifZaman777/Android-Projects/blob/main/BMI%20app/BMI%20Doc%20photo/Login%20activity.png "Login activity" )

     - Activites are nothing but the page or view that is displayed to the user. In the app the first activity is Login activity where user put there name and password if these are correct then the the next activity will be intented.
     - In the app Constraint Layout is used. But at the time of using Constraints layout we have to always be concern about the horizontal and vertical constraining of every element.
   
     - In some particular modification some of XML command have been used.
     ```
     android:layout_gravity="center"
     android:background="@drawable/login"
     android:orientation="vertical"
     ```
   

---

---
- _Login activity_ :

     - TextView and EditText has designed in `activity.main.xml`. In this XML file the data has been given by the user after authentication process that has developed in java user is identified and intent to the next activity,

     Intent Process->

     ```if(name.getText().toString().equals("String") && password.getText().toString().equals("String"))
               {
                    Intent intent=new Intent(MainActivity.this, BmiActivity.class); ///intent is obj of class Intent
                    startActivity(intent); 
               } 
    ```
   

     - Otherwise a loop decrement for every mismatches in the name and passwords and a toast text PopUP to alert the mismatch time , if 3 mismatch is observed then the login button will be dissabled ->

    ```
      else
        {
        counter--;
          Toast.makeText(MainActivity.this, "Attempt remaining "+ counter, Toast.LENGTH_SHORT).show();  ///toast PopUp
        
        if (counter==0)
        {
          Login.setEnabled(false);
        }

    ``` 
   ![](https://github.com/AsifZaman777/Android-Projects/blob/main/BMI%20app/BMI%20Doc%20photo/Login%20dissable.png " Login dissable " )

---

---
-  _BMI activity_:

    - Catch the values from EditText :
        - When user input the data, the data can be recived by being initialisation of the `EditText` variables[height,weight].
        ```
        height=(EditText) findViewById(R.id.userH);
        weight=(EditText) findViewById(R.id.userW);
         
        ```
        - Now the main task is to convert the data from EditText to requred dataType `Float`. First of all the EditText values are converted in the String value using the getter method of default class EditText `getText()` and `tostring()` 
        ```
          String heightString=height.getText().toString();
          String weightString=weight.getText().toString();

        ```
    - Parsing values :
        - After that Parse is used to convert the data from String to Float 
        ````
         ///float///
                   float user_height=Float.parseFloat(heightString);
                   float user_weight=Float.parseFloat(weightString);


        ````
    - TextView Result : 
        - At last a TextView has been designed in a XML file to display the BMI result
        - At last physical condition is diplayed by the `Toast-Text` 
     
          ![](https://github.com/AsifZaman777/Android-Projects/blob/main/BMI%20app/BMI%20Doc%20photo/Phy%20Cond.png " Physical Condition ")     
    
    - Exception handling :
         
        - Blank input exception : 
            &nbsp;

            &nbsp;
            This exception might be the intolerable exception because if somebody clicks the calculate button without inserting any values(Weight, Height) then the app will crash instantinously. To handle this problem `setError()` and `requestFocus()` is used how we can alert the user to input the expected value. Otherwise the app will be crushed.
            
           ```
             if (heightString.equals(""))
               {
                   height.setError("Please insert your height");
                   height.requestFocus();
                   return;
               }

           ``` 
 ![](https://github.com/AsifZaman777/Android-Projects/blob/main/BMI%20app/BMI%20Doc%20photo/Alert.png "Exception handling")

---

&nbsp;

&nbsp;

# _And here we go to enjoy the BMI APP_  --------------->     
