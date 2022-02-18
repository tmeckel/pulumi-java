// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.StandardSqlFieldResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class StandardSqlStructTypeResponse {
    private final List<StandardSqlFieldResponse> fields;

    @OutputCustomType.Constructor({"fields"})
    private StandardSqlStructTypeResponse(List<StandardSqlFieldResponse> fields) {
        this.fields = Objects.requireNonNull(fields);
    }

    public List<StandardSqlFieldResponse> getFields() {
        return this.fields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardSqlStructTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<StandardSqlFieldResponse> fields;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardSqlStructTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
        }

        public Builder setFields(List<StandardSqlFieldResponse> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public StandardSqlStructTypeResponse build() {
            return new StandardSqlStructTypeResponse(fields);
        }
    }
}
