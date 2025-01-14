/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.http.bind.binders;

import io.micronaut.core.annotation.Indexed;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.bind.ArgumentBinder;
import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;

/**
 * A binder that binds from an {@link HttpRequest}.
 *
 * @param <T> A type
 * @author Graeme Rocher
 * @since 1.0
 */
@Indexed(RequestArgumentBinder.class)
public interface RequestArgumentBinder<T> extends ArgumentBinder<T, HttpRequest<?>> {

    /**
     * Create a specific binder.
     *
     * @param argument The bound argument
     * @return The specific binder
     * @since 4.8
     */
    @NonNull
    @Override
    default RequestArgumentBinder<T> createSpecific(@NonNull Argument<T> argument) {
        return this;
    }

}
