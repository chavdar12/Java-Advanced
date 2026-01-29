package src;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SerbianUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> singers = new LinkedHashSet<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" @");
            if (tokens.length == 2) {
                String singer = tokens[0];
                String[] venueAndTickets = tokens[1].split(" ");
                if (venueAndTickets.length == 3) {
                    String venue = venueAndTickets[0];
                    int ticketsPrice = Integer.parseInt(venueAndTickets[1]);
                    int ticketsCount = Integer.parseInt(venueAndTickets[2]);
                    int totalMoney = ticketsPrice * ticketsCount;
                    System.out.println(singer + " @ " + venue + " " + totalMoney);
                    singers.add(singer);
                }
            }
            input = scanner.nextLine();
        }
        singers.forEach(System.out::println);
    }
}
