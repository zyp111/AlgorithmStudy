package _2019._10._07.catAndDogQueue;

public class Test {
    public static void main(String[] args) {
        CatAndDogQueue catAndDogQueue = new CatAndDogQueue();
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        catAndDogQueue.add(cat);
        catAndDogQueue.add(dog);
        catAndDogQueue.add(dog1);
        catAndDogQueue.add(dog2);
        catAndDogQueue.add(cat1);
        catAndDogQueue.pollAll();

    }
}
