package ProgrammingFundamentals._6_ObjectsAndClasses.Exercise._2_Articles;


import java.util.Scanner;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }

    public void rename(String title) {
        this.title = title;
    }

    public void edit(String content) {
        this.content = content;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArticle = sc.nextLine().split(", ");
        int commands = Integer.parseInt(sc.nextLine());

        Article article= new Article(inputArticle[0],inputArticle[1],inputArticle[2] );

        for(int i=0; i < commands; i++){
            String[] commandParts = sc.nextLine().split(": ");
            String command=commandParts[0];
            String newData = commandParts[1];

            if(command.equals("Edit")){
                article.edit(newData);
            } else if (command.equals("ChangeAuthor")) {
                article.changeAuthor(newData);
            } else if (command.equals("Rename")) {
                article.rename(newData);
            }

        }

        System.out.println(article.getTitle()+" - "+article.getContent()+": "+article.getAuthor());
    }
}
