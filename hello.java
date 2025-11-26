JAVA FILE OF XML:
import javax.xml.parsers.DocumentBuilder:
import javax.xml.parsers.DocumentBuilderFactory:
import org.w3c.dom.Document; import org.w3c.dom.NodeList;
import org.w3c.dom.Element:
import java.io.File:
public class ReadXL (
public static void main(Stringt] args) throws Exception (
// Load the XML file
File file - new Filer"people.xm1"): Make sure the XL file is in your project folder
11 Create DocumentBuilder
DocumentBuilderFactory factory - DocumentBuilderFactory.newInstance():
DocumentBuilder builder - factory.newDocumentBuilder():
// Parse the XML file
Document document - builder.parse(file):
1/ Normalize XML structure
document .getDocumentElement).normalize():
11 Read all <Person> tags
NodeList list - document.getElementsByTagName("Person"):
for (int i = 0; i ‹ list.getLength(): i++) {
Element person = (Element) list.item(i):
firstName - person.getElementsByTagName("FirstName"). item(0) -getTextContent():
lastName
- person. getElementsByTagName("LastName").item(0) .getTextContent():
I/String
agestr person. getlementsByTagName®Age").item(0) getTextContent):
/int age - Integer.parseInt(ageStr);
System.out.println("First Name, " + lastName):
" + firstName):
System.out.println("Last Name:
system.out.println("Age: " + age):
System.out.println("---
