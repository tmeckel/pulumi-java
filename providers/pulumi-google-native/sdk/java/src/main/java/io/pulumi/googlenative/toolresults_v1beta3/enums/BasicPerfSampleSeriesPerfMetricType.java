// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum BasicPerfSampleSeriesPerfMetricType {
        PerfMetricTypeUnspecified("perfMetricTypeUnspecified"),
        Memory("memory"),
        Cpu("cpu"),
        Network("network"),
        Graphics("graphics");

        private final String value;

        BasicPerfSampleSeriesPerfMetricType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BasicPerfSampleSeriesPerfMetricType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
