# Part One
### Question One 
- a) Username in the email address

For example , At Turntabl although all emails end with the same domain `@turntabl.io` the usernames before the domian uniquely identifies the exact person.

- b) Fingerprint

Since fingerprints vary , its very reliable when it comes to investigation.
- c) unique set of digit 
Phone numbers have unique set of digits 

- d) Fingerprint , user details

EVery Employee's fingerprint uniquely identifies them allowing the system to keep track of those who clock in and out.


### Question Two

- Phone

  The brand , the colour of the phone , the deviceID.

- Laptop

  The brand and the colour , the deviceID

- Bag 
  The colour ,serial number

- WaterBottle
  The design on the bottle , serial Number


  
### Question Three 
`Composition`

- The phone and its battery
- The laptop and its hard drive


`Association`
- The phone and its charger
- The laptop and its charger 


### Question Four

- the person holds custody of the phone and laptop

- the bag holds my pencilcase and book



### Question Five 

A charger would be needed to connect the phone or the laptop to the socket 



# Part Two

### Question One

`Base Class` - Resource


`Class`
- Employee

  * Dev
  * HR
  * Co ordinator
- Appliance

  * Phone
  * Laptop


### Question Two

- TurnOff() in phone overrides the TurnOff() in Laptop
- Deactivate of an employee from having acess to company system overrides the deactivates the access an HR or Co ordinator has access to 



`Violation`

If turning off an Employee is supposed to block all access, but HR or Coordinator only partially lose access, that’s a mistake


### Question Three

`Inheritance Polymorphism`

The turnOff() in phone class and Laptop class behave differently based on object type 


`Parametric Polymorphism`

For parametric polymorphism the method works the same despite the object type

### Question Four


Employee and Appliance both inherit from Resource.
AdminSupport inherits from Employee and Appliance 





### Question Five 
- a. room, house    `composition`

- b. boat, fleet      `composition`

- c. cruiser, boat    `inheritance`

- d. living room, house   `composition`

- e. son, child        `inheritance`

- f. noun, word         `inheritance`

- g. word, sentence      `composition`

- h. child, family        `composition`
  








