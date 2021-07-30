# T-HepsiEmlakWebTest
 
- Quality Assurance Engineer Assessment
- We have a basic challenge project. 
- You only need to go through these cases on our site www.hurriyetemlak.com.
- You can use selenium or zalenium.
- You need to use Java as the programming language.
- You have to implement 2 cases for our desktop web and mobile web site. (You will have 4 tests. 2 tests for desktop web, 2 tests for mobile web. Not the Mobile app.)
- You need to set user-agent header being able to open and test the mobile web site
- You need to push your project into Github and share the link with us.
- Your project should include a Readme file with simple instructions to run the tests.
 
 # Case 1:
- Go to Main Page
- Click on “Satılık”
- Make a search: Izmir - Bornova; İş Yeri; Fiyat : 100.000 TL - 2.000.000 TL; Bina Yaşı: Sıfır Bina, 1-5, 6-10;
- Click Search
- Check for Tags in the filter area: Izmir - Bornova; İş Yeri; 100.000 TL - 2.000.000 TL; Sıfır Bina, 1-5, 6-10;

# Case 2:
- Go to Main Page
- Click on "Kiralık”
- Make a search: Ankara - Çankaya; Konut; 2+1; Site İçerisinde: Evet ;
- Click on the 3rd listing on the results and go to listing detail page.
- WEB: On the Detail page there is a “Show Phone Number” link on the right.
- MOBILE: On the detail page there is a “Call the listing owner” link on the bottom.
- Validate the phone number that it is a real and valid mobile or landline number. (eg.+905xxxxxxxxx , +90212xxxxxxx)

--- Update the device in Basetest. By mobile or web.
