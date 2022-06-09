package AlgorithmFinal;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
    }

}
/**
 * Job Scheduling with deadline and profit(jobs, time)
 * int[] slots = new int[time];
 * slots fills with -1
 * profit = 0
 * sort jobs by profits in decreasing order
 *
 * for (job in jobs)
 * {
 *      // job.time - 1 because array is 0 based
 *     for (int j = job.time - 1; j >= 0; j--)
 *     {
 *          // if j is less than deadline and slot[j] is free slot
 *         if (j < time and slots[j] == -1)
 *         {
 *             slot[j] = job.ID;
 *             profit += job.profit;
 *             break
 *         }
 *     }
 * }
 * ALGORITHM Dijkstra(G, s)
 * //Dijkstra’s algorithm for single-source shortest paths
 * //Input: A weighted connected graph G =   V,E with nonnegative weights
 * // and its vertex s
 * //Output: The length dv of a shortest path from s to v
 * // and its penultimate vertex pv for every vertex v in V
 *
 * Initialize(Q) //initialize priority queue to empty
 * for every vertex v in V
 *      dv ← ∞; pv ← null   // mark previous visited node to be null, all distance is infinity
 *      Insert(Q, v, dv) //initialize vertex priority in the priority queue
 *
 * ds ← 0; Decrease(Q, s, ds) //update priority of s with ds
 * VT ← ∅     // visited current is null
 * for i ← 0 to |V | − 1 do
 *      u∗ ← DeleteMin(Q) //delete the minimum priority element -> O(log n)
 *      VT ← VT ∪ {u∗} // move the node to visited node
 *      for every vertex u in V − VT that is adjacent to u∗ do // if the node is right next to current node
 *          if du∗ + w(u∗, u) < du              // not necessarily that every edge needs to be checked because
 *                                              // not all vertices are neighbour with current vertex
 *              du ← du∗ + w(u∗, u); pu ← u∗
 *              Decrease(Q, u, du)
 *
 *
 * GreedyChange(amount, D[1...m])   // the amount you want to make up, D[1, 2, 5, 10, 25] coin denomination
 * instantiate C[1...amount]
 *
 * for (i = m to 1)
 * {
 *     while (amount >= D[i])
 *     {
 *         amount = amount - D[i];
 *         C.add(D[i])
 *     }
 * }
 *
 * FractionalKnapsack(capacity, weight[n...m], value[x..y])
 * // O(n log n)
 *
 * int totalValue = 0;
 * for (int i = 0 to m)
 * {
 *      array[i] = value[i] / weight[i];
 * }
 * Arrays.sort(array -> decreasing order);
 * for (item in array)
 * {
 *     if (capacity - item.weight >= 0)
 *     {
 *         capacity -= item.weight;
 *         totalValue += item.value;
 *     }
 *     else
 *     {
 *         totalValue += capacity * (item.value / item.weight);
 *         capacity = 0;
 *     }
 * }
 * return totalValue;
 *
 *
 *
 * */
