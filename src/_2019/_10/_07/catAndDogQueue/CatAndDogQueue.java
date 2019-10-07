package _2019._10._07.catAndDogQueue;

import java.util.LinkedList;
import java.util.Queue;

public class CatAndDogQueue {
    private Queue<PetEnterQueue> dogQueue = new LinkedList<>();
    private Queue<PetEnterQueue> catQueue = new LinkedList<>();
    private int count = 0;
    public void add(Pet pet) {
        count++;
        if(pet.getPetType().equals("dog"))
            dogQueue.add(new PetEnterQueue(pet,count));
        else
            catQueue.add(new PetEnterQueue(pet,count));
    }
    public void pollAll() {
        while((!dogQueue.isEmpty()) || (!catQueue.isEmpty())) {
            PetEnterQueue petEnterQueue;
            if(dogQueue.isEmpty()) {
                petEnterQueue = catQueue.poll();
            } else if(catQueue.isEmpty()) {
                petEnterQueue = dogQueue.poll();
            } else {
                petEnterQueue = dogQueue.peek().getCount() < catQueue.peek().getCount() ? dogQueue.poll() : catQueue.poll();
            }
            System.out.println(petEnterQueue.getEnterPetType()+petEnterQueue.getCount());
        }
    }
    public void pollDog() {
        while(!dogQueue.isEmpty()) {
            System.out.println(dogQueue.poll().getEnterPetType());
        }
    }
    public void pollCat() {
        while(!catQueue.isEmpty()) {
            System.out.println(catQueue.poll().getEnterPetType());
        }
    }
    public boolean isEmpty() {
        return dogQueue.isEmpty() && catQueue.isEmpty();
    }
    public boolean isDogEmpty() {
        return dogQueue.isEmpty();
    }
    public boolean isCatEmpty() {
        return catQueue.isEmpty();
    }
}
