package com.example.problem3;
/*What is the largest prime factor of the number 600851475143 ?*/
public class problem3 {
    public static int is_prime(long quest)
    {
        for(long i=2L;i<quest;i+=1){
            if(quest%i==0)
            {
                return 0;
            }
        }
        return 1;
    }

    public static long first_prime(long question)
    {
        long answer = 1L;
        for(long i = 2L; i<question;i+=1)
        {
            if(question%i==0 && is_prime(i)==1)
            {
                answer = (long)question/i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        long quest = 600851475143L;
        long ans = quest;
;        while(first_prime(ans)!= 1L)
        {
            ans = first_prime(ans);
        }
        System.out.println(ans);
    }
}

