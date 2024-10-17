/*
 * Copyright 2017-2024 original authors
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
package io.micronaut.http.server.exceptions.response;

import io.micronaut.http.MediaType;

/**
 * A {@link ErrorResponseBodyProvider} for JSON responses.
 * Responses with content type {@link io.micronaut.http.MediaType#APPLICATION_JSON}.
 * @author Sergio del Amo
 * @since 4.7.0
 * @param <T> The error type
 */
@FunctionalInterface
public interface JsonErrorResponseBodyProvider<T> extends ErrorResponseBodyProvider<T> {
    @Override
    default String contentType() {
        return MediaType.APPLICATION_JSON;
    }
}