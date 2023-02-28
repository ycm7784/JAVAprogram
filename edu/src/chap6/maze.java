package chap6;

import java.util.Stack;
enum DIR { N, NE, E, SE, S, SW, W, NW };
class items {
	int x, y;
	int dir;
	
}


class offsets {
	int a, b;
}

public class maze {
	
private static final int N = 0;
private static final int NE = 1;
private static final int E = 2;
private static final int SE = 3;
private static final int S = 4;
private static final int SW = 5;
private static final int W = 6;
private static final int NW = 7;
static offsets[] moves = new offsets[8];
static int [][]maze = new int[100][100];
static int [][]mark = new int[100][100];

static void path(int m, int p)
// Output a path (if any) in the maze; rows is m, cols is p;
{
	//start at (1,1)
	mark[1][1] = 2;
	Stack<items> stack = new Stack<items>();
	items temp = new items() ;
	temp.x = 1; temp.y = 1; temp.dir = N;
	stack.push(temp);


	while (!stack.isEmpty()) // stack not empty
	{	
		mark[temp.x][temp.y] = 0;
		temp = stack.pop(); // unstack
		
		int i = temp.x; int j = temp.y; int d = temp.dir;
		
		while (d < 8) // moves forward
		{
			System.out.println("i: " + i + " j: " + j +" d: "+d +"mark["+i+"]["+j+"]: "+mark[i][j]);
		
			int g = i + moves[d].a;
			int h = j + moves[d].b;
			if ((g == m) && (h == p)) { // reached exit
										// output path
			
				System.out.println("the term near the exit: " + i + " " + j );
				System.out.println("exit: " + m + " " + p);
				return;
			}
			if ((maze[g][h]==0) && (mark[g][h]==0)) { // new position
				mark[g][h] = 2;
				//push the old temp to the stack, but the direction changes.
				//Because the neighbor in the direction of d has been checked.
				temp = new items();
				temp.x = i;  temp.y = j; temp.dir = d + 1;
				
			
				stack.push(temp); // stack it
				i = g; j = h; d = N; // moves to (g,h)
			}
			else d++; // try next direction
		}
	}
	System.out.println( "no path in maze ");
}
public static void main(String[] args){
	int [][]input = {
	{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
	{ 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
	{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
	{ 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
	{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
	{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
	{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
	{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
	{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
	{ 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
	{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 },
	{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 },
	};
	for (int i = 0; i < 8; i++)
		moves[i] = new offsets();
	moves[N].a = -1; moves[N].b = 0;
	moves[NE].a = -1; moves[NE].b = 1;
	moves[E].a = 0; moves[E].b = 1;
	moves[SE].a = 1; moves[SE].b = 1;
	moves[S].a = 1; moves[S].b = 0;
	moves[SW].a = 1; moves[SW].b = -1;
	moves[W].a = 0; moves[W].b = -1;
	moves[NW].a = -1; moves[NW].b = -1;


	for (int i = 0; i < 14; i++) {
		for (int j = 0; j < 17; j++){
			if ((i==0) || (j==0) || (i == 13) || (j == 16))
				maze[i][j] = 1;
			else {
				maze[i][j] = input[i-1][j-1];
			};
			mark[i][j] = 0;

		}
	}
	for (int i = 0; i <= 13; i++)
	{
		for (int j = 0; j <= 16; j++)
		System.out.print(maze[i][j]+ "  ");
		System.out.println();
	}
	path(12, 15);
	for (int i = 0; i <= 13; i++)
	{
		for (int j = 0; j <= 16; j++)
		System.out.print(mark[i][j]+ "  ");
		System.out.println();
	}
	System.out.println("end");
}
}