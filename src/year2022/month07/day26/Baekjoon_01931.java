package year2022.month07.day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// 회의실 배정
public class Baekjoon_01931 {
	
	static class MeetingRoom implements Comparable<MeetingRoom> {
		int start;
		int end;

		public MeetingRoom(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(MeetingRoom o) {
			// TODO Auto-generated method stub
			int diff = this.end - o.end;
			return diff != 0 ? diff : this.start - o.start;
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		MeetingRoom[] m = new MeetingRoom[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			m[i] = new MeetingRoom(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}

		int time = 0;
		int cnt = 0;
		Arrays.sort(m);

		for (int i = 0; i < N; i++) {
			if (time <= m[i].start) {
				cnt++;
				time = m[i].end;
			}
		}
		System.out.println(cnt);
		br.close();

	}

}
