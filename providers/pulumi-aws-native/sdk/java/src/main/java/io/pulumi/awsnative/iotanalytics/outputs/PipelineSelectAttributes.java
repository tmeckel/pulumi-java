// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PipelineSelectAttributes {
    private final List<String> attributes;
    private final String name;
    private final @Nullable String next;

    @OutputCustomType.Constructor
    private PipelineSelectAttributes(
        @OutputCustomType.Parameter("attributes") List<String> attributes,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("next") @Nullable String next) {
        this.attributes = attributes;
        this.name = name;
        this.next = next;
    }

    public List<String> getAttributes() {
        return this.attributes;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getNext() {
        return Optional.ofNullable(this.next);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineSelectAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> attributes;
        private String name;
        private @Nullable String next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineSelectAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder attributes(List<String> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder next(@Nullable String next) {
            this.next = next;
            return this;
        }
        public PipelineSelectAttributes build() {
            return new PipelineSelectAttributes(attributes, name, next);
        }
    }
}
