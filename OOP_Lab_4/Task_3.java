import java.util.Random;
import java.util.Scanner;

class Walker
{
    private final String name;
    private int x;
    private int y;

    public Walker(String name)
    {
        this.name = name;
        this.x = 0;
        this.y = 0;
    }

    public String getName() { return name; }
    public int getX() { return x; }
    public int getY() { return y; }

    public String location()
    {
        return "(" + x + " : " + y + ")";
    }
    public boolean move(int dx, int dy, Obstacles obstacles)
    {
        int newX = x + dx;
        int newY = y + dy;

        if (obstacles.isBlocked(newX, newY))
        {
            System.out.println(name + " encounters hurdle at (" + newX + ":" + newY + ")");
            return false;
        }
        x = newX;
        y = newY;
        return true;
    }

    // Ali's way: the user gives the direction as ^ v < >. Returns false for a bad symbol.
    public boolean moveBySymbol(char symbol, Obstacles obstacles)
    {
        switch (symbol)
        {
            case '^': move(0, 1, obstacles); return true;
            case 'v':
            case 'V': move(0, -1, obstacles); return true;
            case '<': move(-1, 0, obstacles); return true;
            case '>': move(1, 0, obstacles); return true;
            default: return false;
        }
    }

    // Hasan's way: picks one of the four directions at random.
    public void moveRandomly(Obstacles obstacles, Random random)
    {
        switch (random.nextInt(4))
        {
            case 0: move(0, 1, obstacles); break;
            case 1: move(0, -1, obstacles); break;
            case 2: move(-1, 0, obstacles); break;
            default: move(1, 0, obstacles);
        }
    }
}

class Obstacles
{
    private final int[][] cells;

    public Obstacles(int[][] cells)
    {
        this.cells = cells;
    }

    public boolean isBlocked(int x, int y)
    {
        for (int[] c : cells)
        {
            if (c[0] == x && c[1] == y)
            {
                return true;
            }
        }
        return false;
    }
}

public class Task_3
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Hurdles both of them must avoid. Change these to match your earlier lab.
        Obstacles obstacles = new Obstacles(new int[][]{ {1, 2}, {-1, 1}, {2, -1}, {-2, -2}, {0, 3} });

        Walker ali = new Walker("Ali");
        Walker hasan = new Walker("Hasan");

        System.out.println("Starting: Ali's Location is = " + ali.location()
                + "   Hasan's Location is = " + hasan.location());
        System.out.println("Hasan has Random Movement, Ali follows order");
        System.out.println("(Use ^ up, v down, < left, > right, q to quit)\n");

        while (true)
        {
            System.out.print("Ali: Where should I go now: ");
            if (!sc.hasNext())
            {
                break;
            }
            String input = sc.next();

            if (input.equalsIgnoreCase("q"))
            {
                System.out.println("Okay, both of them stop here. Bye!");
                break;
            }
            if (input.length() != 1 || !ali.moveBySymbol(input.charAt(0), obstacles))
            {
                System.out.println("Ali didn't understand that. Please use ^ v < > or q.\n");
                continue;
            }

            System.out.println("Ali is at = " + ali.location());
            hasan.moveRandomly(obstacles, random);
            System.out.println("Hasan is at = " + hasan.location() + "\n");
        }
    }
}