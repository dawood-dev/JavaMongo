package javamongo.services;

import javamongo.interfaces.IData;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class FindData {

    private final IData iData;

    public String invoke() {
        return iData.data();
    }

}