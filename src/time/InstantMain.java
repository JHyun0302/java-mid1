package time;

import java.time.Instant;
import java.time.ZonedDateTime;

/**
 * Instant : 전세계 모든 서버 시간을 똑같이 맞출 수 있음, 항상 UTC 기준이므로 한국에 있는 `Instant` , 미국에 있는 `Instant` 의 시간이 똑같음
 */
public class InstantMain {
    public static void main(String[] args) {
        //생성
        Instant now = Instant.now(); //UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0); //1970년 1월 1일 0시 0분 0초로 생성
        System.out.println("epochStart = " + epochStart);

        //계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        //조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
