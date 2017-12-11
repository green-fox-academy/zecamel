public class Main {
    public static void main(String[] args) {

        BlogPost blogpost1 = new BlogPost();
        blogpost1.setTitle( "Lorem Ipsum" );
        blogpost1.setAuthorName( "John Doe" );
        blogpost1.setPublicationDate( "2000.05.04" );
        blogpost1.setText( "Lorem ipsum dolor sit amet" );

        BlogPost blogpost2 = new BlogPost();
        blogpost2.setTitle( "Wait but why" );
        blogpost2.setAuthorName( "Tim Urban" );
        blogpost2.setPublicationDate( "2010.10.10" );
        blogpost1.setText( "A popular long-form, stick-figure-illustrated blog about almost everything." );

        BlogPost blogpost3 = new BlogPost();
        blogpost3.setTitle( "One Engineer Is Trying to Get IBM to Reckon With Trump" );
        blogpost3.setAuthorName( "William Turton" );
        blogpost3.setPublicationDate( "2017.03.28" );
        blogpost3.setText( "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing." );

        System.out.println(blogpost3.text);
    }
}
