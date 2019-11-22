package org.ranapat.parameterizedmessage;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public ParameterizedMessage getMessage1() {
        return new ParameterizedMessage(R.string.key1);
    }

    public ParameterizedMessage getMessage2(final String parameter) {
        return new ParameterizedMessage(R.string.key2, new Object[]{parameter});
    }

    public ParameterizedMessage getMessage3() {
        return new ParameterizedMessage("value3");
    }

    public ParameterizedMessage getMessage4(final String parameter) {
        return new ParameterizedMessage("value4 %s", new Object[]{parameter});
    }

}
