package com.example.eventpublisher.Record;

import org.springframework.stereotype.Repository;

@Repository
public class BusinessCentral<E> {

    public BusinessCentral<E> GetClassType() { return this; }
    public BusinessCentral<E> Init() { Init(false); return this; };

    public BusinessCentral<E> Init(Boolean UserTrigger) { return this; };

    public BusinessCentral<E> Validate(E field, String newValue) { return this; };

    public BusinessCentral<E> SetLoadFields() { return this; };

    public BusinessCentral<E> SetRange() { return this;};

    public BusinessCentral<E> SetFilter() { return this; };

    public BusinessCentral<E> FindSet() { return this; };

    public BusinessCentral<E> Modify() { Modify(false); return this; };
    public BusinessCentral<E> Modify(Boolean UserTrigger) { return this; };

    public BusinessCentral<E> Delete() { Delete(false); return this; };
    public BusinessCentral<E> Delete(Boolean UserTrigger) { return this; };

    public BusinessCentral<E> Insert() { Insert(false); return this; };
    public BusinessCentral<E> Insert(Boolean UserTrigger) { return this; };
}
