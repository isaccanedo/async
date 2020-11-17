package br.com.isaccanedo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * @author Isac Canedo
 */
@Component
public class Task {
    public static Random random = new Random();

    @Async
    public Future<String> doTaskOne() throws InterruptedException {
        System.out.println("Iniciar tarefa um");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("Conclua a tarefa um, demorada: " + (end - start) + "milissegundo");
        return new AsyncResult<>("Assim que a tarefa for concluída");
    }

    @Async
    public Future<String> doTaskSecond() throws InterruptedException {
        System.out.println("Iniciar tarefa dois");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("Conclua a tarefa dois, demorada: " + (end - start) + "milissegundo");
        return new AsyncResult<>("Missão dois completada");
    }

    @Async
    public Future<String> doTaskThird() throws InterruptedException {
        System.out.println("Iniciar tarefa três");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("Conclua a tarefa três, demorada: " + (end - start) + "milissegundo");
        return new AsyncResult<>("Missão três completada");
    }


}
