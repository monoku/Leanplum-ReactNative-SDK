package com.reactlibrary.leanplum.inbox.mapper.def;

import com.facebook.react.bridge.WritableMap;

public interface BasicMapper<Entity> {

    WritableMap toWritableMap(Entity entity);

}