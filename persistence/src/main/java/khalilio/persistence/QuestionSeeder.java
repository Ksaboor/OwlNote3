package khalilio.persistence;

import khalilio.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QuestionSeeder implements CommandLineRunner {

    @Autowired
    public QuestionRepository repository;

    public QuestionSeeder(QuestionRepository repository){ this.repository = repository;}

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Question("Where were you five years ago?"));
        repository.save(new Question("Where do you see yourself in five years"));
        repository.save(new Question("Write a letter to your older self."));
        repository.save(new Question("Write a letter to your future children and grandchildren that you can give to them when they are older?"));
        repository.save(new Question("Write a letter to your boss or coworkers."));
        repository.save(new Question("Write about your daily activities so you can look back and remember each moment."));
    }
}