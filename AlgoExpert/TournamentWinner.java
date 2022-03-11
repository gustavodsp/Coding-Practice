import java.util.*;

class Program {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    // Write your code here.

    String best = "";
    HashMap<String,Integer> scores = new HashMap<String, Integer>();
    scores.put(best, 0);

    for(int i=0;i<results.size();i++){
        
        int result=0;
        if(results.get(i)==0){
            result = 1;
        }

        String wonTeam = competitions.get(i).get(result);

        if(!scores.containsKey(wonTeam)){
            scores.put(wonTeam,3);
        }
        else{
            scores.put(wonTeam, scores.get(wonTeam)+3);
        }

        if(scores.get(wonTeam)>scores.get(best)){
            best=wonTeam;
        }

    }

    return best;
  }
}