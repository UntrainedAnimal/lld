package org.example.design_patterns.observer;

public class MyTopicSubscriber implements Observer{
    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }


    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }

    @Override
    public void update() {
        String update = (String) topic.getUpdate();
        if(update==null){
            System.out.println("no new message");
        }
        else{
            System.out.println(name + " new message is "+update);
        }
    }
}
