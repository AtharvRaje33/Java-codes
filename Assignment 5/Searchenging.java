import java.util.List;

class Searchenging {

    public static void search(List<String> documents, String keyword) {
        for (String document : documents) {
            if (document.contains(keyword)) {
                System.out.println("Found in document: " + document);
            }
        }
    }

    public static void search(List<String> documents,int endyear) {
    	for (String document : documents) {
            if (document.contains(String.valueOf(endyear))) {
                System.out.println("Found in document: " + document);
            }
        }
    }



    public static void main(String[] args) {
        List<String> documents = List.of("Document 1 - Java programming",
                                         "Document 2 - Python programming",
                                         "Document 3 - Algorithms in Java");
        
       Searchenging se = new Searchenging();
       se.search(documents, "Java");
       se.search(documents, 2000);
       
  
    }
}
