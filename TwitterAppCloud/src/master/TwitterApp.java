package master;


public class TwitterApp {

	public static void main(String[] args) {
		
		TwitterTweetProvider provider = new TwitterTweetProvider(args[1], args[2], args[3], args[4]);
		
		Tweet tweet;
		
		while((tweet = provider.getNextTweet()) != null) {
			System.out.println(tweet);
		}
		
		
	}

}
