package year2022.month07.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
// 숨바꼭질 
public class Baekjoon_01697 {

   
   static Queue<Integer> q = new LinkedList<>();
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static int n,k;
   static int check[];
   
   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
	  
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      n = Integer.parseInt(st.nextToken());
      k = Integer.parseInt(st.nextToken());
      
      check = new int [1000001];
      Arrays.fill(check, -1);
      
      bfs();
      
      bw.write(check[k] +1 +"");      // 결국 그 위치에 제일 먼저 도착한 횟수가 출력
      
      br.close();
      bw.flush();
      bw.close();
   }

   
   static void bfs() throws IOException  { // 일단 큐에 값 집어넣고 그 값에 해당하는 +1, -1, x2 연산을 다해줌.

      q.add(n); // 큐에 n값 저장
      
        while(!q.isEmpty())  {
            n = q.poll();         // n에 q의 첫번째 값 저장 후 큐에서 제거
            
            if(n == k) {   
               break;
            }

            if(n+1 <= 100000 && check[n+1] == -1) {  // n+1의 위치가 비었으면 체크의 위치를 현재 체크+1해줌
               q.add(n+1);
               check[n+1] = check[n]+1;
            }
            
            if(n-1 >= 0 && check[n-1] == -1) {   // n-1의 위치가 비었으면 체크의 위치를 현재 체크+1해줌
               q.add(n-1);
               check[n-1] = check[n]+1;
            }
 
            if(n*2 <= 100000 && check[n*2] == -1) {  // n*2 의 위치가 비었으면 체크의 위치를 현재 체크+1해줌
               q.add(n*2);
               check[n*2] = check[n]+1;
            }
            
            

        }
       // bw.write(check[k]+"");      // 결국 그 위치에 제일 먼저 도착한 횟수가 출력
   }
}