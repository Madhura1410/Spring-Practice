package SpringCore.LibraryManagement;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "SpringCore/LibraryManagement/application-context.xml");

        LibraryService service =
                context.getBean("libraryService", LibraryService.class);

        IO.println(service.getCodeAndName());

        Library library =
                context.getBean("library", Library.class);

        int code = library.getLibraryCode();

        Library details = service.getDetails(code);

        if (details != null) {
            IO.println(details);
        } else {
            IO.println("No match Found!");
        }

        context.close();
    }
}