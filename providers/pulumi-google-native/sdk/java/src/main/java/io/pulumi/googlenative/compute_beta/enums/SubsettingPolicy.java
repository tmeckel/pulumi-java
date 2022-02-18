// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum SubsettingPolicy {
        /**
         * Subsetting based on consistent hashing. For Traffic Director, the number of backends per backend group (the subset size) is based on the `subset_size` parameter. For Internal HTTP(S) load balancing, the number of backends per backend group (the subset size) is dynamically adjusted in two cases: - As the number of proxy instances participating in Internal HTTP(S) load balancing increases, the subset size decreases. - When the total number of backends in a network exceeds the capacity of a single proxy instance, subset sizes are reduced automatically for each service that has backend subsetting enabled.
         * 
         */
        ConsistentHashSubsetting("CONSISTENT_HASH_SUBSETTING"),
        /**
         * No Subsetting. Clients may open connections and send traffic to all backends of this backend service. This can lead to performance issues if there is substantial imbalance in the count of clients and backends.
         * 
         */
        None("NONE");

        private final String value;

        SubsettingPolicy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SubsettingPolicy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
