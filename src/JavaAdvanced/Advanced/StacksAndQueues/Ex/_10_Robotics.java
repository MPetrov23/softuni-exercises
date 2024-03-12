package JavaAdvanced.Advanced.StacksAndQueues.Ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class _10_Robotics {
    static class Robot implements Comparable<Robot> {
        String name;
        int processTime;
        Date completionTime;

        public Robot(String name, int processTime) {
            this.name = name;
            this.processTime = processTime;
            this.completionTime = new Date(0);
        }

        @Override
        public int compareTo(Robot other) {
            return this.completionTime.compareTo(other.completionTime);
        }
    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        // Read robots and their processing times
        String[] robotData = scanner.nextLine().split(";");
        Queue<Robot> robots = new LinkedList<>();
        for (String data : robotData) {
            String[] parts = data.split("-");
            robots.offer(new Robot(parts[0], Integer.parseInt(parts[1])));
        }

        // Read starting time
        String startTimeStr = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date currentTime = dateFormat.parse(startTimeStr);
        currentTime.setTime(currentTime.getTime() + 1000); // Start 1 second after the specified time

        // Process products until the "End" command is received
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            Robot currentRobot = robots.poll();
            Date processingStartTime = new Date(Math.max(currentTime.getTime(), currentRobot.completionTime.getTime()));
            System.out.printf("%s - %s [%s]%n", currentRobot.name, product, dateFormat.format(processingStartTime));

            currentTime = new Date(processingStartTime.getTime() + currentRobot.processTime * 1000);
            currentRobot.completionTime = new Date(currentTime.getTime());
            robots.offer(currentRobot);

            // Check if there are any products in the assembly line for the next second
            if (scanner.hasNextLine()) {
                product = scanner.nextLine();
            } else {
                break;
            }
        }

        scanner.close();
    }
    }

