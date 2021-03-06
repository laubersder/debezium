/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.debezium.engine;

import io.debezium.common.annotation.Incubating;

/**
 * The logical description of the output format used by the given instance of {@link DebeziumEngine}.
 */
@Incubating
public interface ChangeEventFormat<T> {
}
