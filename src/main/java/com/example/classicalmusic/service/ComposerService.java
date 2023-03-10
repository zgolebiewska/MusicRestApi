package com.example.classicalmusic.service;
import com.example.classicalmusic.model.Composer;
import org.springframework.stereotype.Service;

@Service
public interface ComposerService {
    Composer createComposer(Composer composer);
    Iterable<Composer> getComposers();

    Composer getComposerById(long id);

    Composer updateComposer(Composer composer, long id);

    void deleteById(long id);
    Iterable<Composer> getAllByEpoch(String epoch);
}
