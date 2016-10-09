<!DOCTYPE HTML>  
<html>
    <head>
        <style>
            .error {color: #FF0000;}
        </style>
    </head>
    <body>
        <?php
            $nameErr = $emailErr = $genderErr = $websiteErr = "";
            $name = $email = $gender = $comment = $website = "";
            // define variables and set to empty values
        ?>
        <h2>PHP Form</h2>
        <p><span class="error">* required field.</span></p>
        <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
            Name: <input type="text" name="name" value="<?php echo $name;?>">
            <span class="error">* <?php echo $nameErr;?></span>
            <br><br>
            E-mail: <input type="text" name="email" value="<?php echo $email;?>">
            <span class="error">* <?php echo $emailErr;?></span>
            <br><br>
            Website: <input type="text" name="website" value="<?php echo $website;?>">
            <span class="error"><?php echo $websiteErr;?></span>
            <br><br>
            Comment: <textarea name="comment" rows="5" cols="40"><?php echo $comment;?></textarea>
            <br><br>
            Gender:
            <input type="radio" name="gender" <?php if (isset($gender) && $gender=="female") echo "checked";?> value="female">Female
            <input type="radio" name="gender" <?php if (isset($gender) && $gender=="male") echo "checked";?> value="male">Male
            <span class="error">* <?php echo $genderErr;?></span>
            <br><br>
            <input type="submit" name="submit" value="Submit">  
        </form>
        <?php
            $error = 0;
            if ($_SERVER["REQUEST_METHOD"] == "POST") 
            {
                if (empty($_POST["name"]))
                {
                    $nameErr = "Name is required";
                    $error = 1;
                    goto end;
                }
                else
                {
                    $name = test_input($_POST["name"]);
                    // check if name only contains letters and whitespace
                    if (!preg_match("/^[a-zA-Z ]*$/",$name))
                    {
                        $nameErr = "Only letters and white space allowed";
                        $error = 1;
                        goto end;
                    }
                }

                if (empty($_POST["email"]))
                {
                    $emailErr = "Email is required";
                    $error = 1;
                    goto end;
                }    
                else 
                {
                    $email = test_input($_POST["email"]);
                    // check if e-mail address is well-formed
                    if (!filter_var($email, FILTER_VALIDATE_EMAIL))
                    {
                        $emailErr = "Invalid email format";
                        $error = 1;
                        goto end;
                    }    
                }

                if (empty($_POST["website"]))
                    $website = "";
                else 
                {
                    $website = test_input($_POST["website"]);
                    // check if URL address syntax is valid (this regular expression also allows dashes in the URL)
                    if (!preg_match("/\b(?:(?:https?|ftp):\/\/|www\.)[-a-z0-9+&@#\/%?=~_|!:,.;]*[-a-z0-9+&@#\/%=~_|]/i",$website))
                    {
                        $websiteErr = "Invalid URL";
                        $error = 1;
                        goto end;
                    }    
                }

                if (empty($_POST["comment"]))
                    $comment = "";
                else 
                    $comment = test_input($_POST["comment"]);

                if (empty($_POST["gender"]))
                {
                    $genderErr = "Gender is required";
                    $error = 1;
                    goto end;
                }
                else
                {
                    if(test_input($_POST["gender"]) == "male")
                        $gender = 'M';
                    else
                        $gender = 'F';
                }

                if($error == 0)
                {
                    require '../connectToDB.php';

                    $query = "INSERT INTO `phpform2` (`Name`, `Email`, `Website`, `Comment`, `Gender`) VALUES ('".$name."', '".$email."', '".$website."', '".$comment."', '".$gender."')";

                    if($is_query_run=mysql_query($query))
                    {
                        echo "<br>query executed<br>";
                    }
                    else
                    {
                        echo "<br>query not executed<br>";
                    }
                }
            }

            function test_input($data) 
            {
                $data = trim($data);
                $data = stripslashes($data);
                $data = htmlspecialchars($data);
                return $data;
            }

            end:

            echo "<h2>Your Input:</h2>";
            echo $name;
            echo "<br>";
            echo $email;
            echo "<br>";
            echo $website;
            echo "<br>";
            echo $comment;
            echo "<br>";
            echo $gender;
            echo "<br>";
            
        ?>
    </body>
</html>