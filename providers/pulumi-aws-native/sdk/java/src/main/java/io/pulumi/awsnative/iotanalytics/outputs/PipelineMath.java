// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PipelineMath {
    private final String attribute;
    private final String math;
    private final String name;
    private final @Nullable String next;

    @OutputCustomType.Constructor
    private PipelineMath(
        @OutputCustomType.Parameter("attribute") String attribute,
        @OutputCustomType.Parameter("math") String math,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("next") @Nullable String next) {
        this.attribute = attribute;
        this.math = math;
        this.name = name;
        this.next = next;
    }

    public String getAttribute() {
        return this.attribute;
    }
    public String getMath() {
        return this.math;
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

    public static Builder builder(PipelineMath defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attribute;
        private String math;
        private String name;
        private @Nullable String next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineMath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.math = defaults.math;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder attribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder math(String math) {
            this.math = Objects.requireNonNull(math);
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
        public PipelineMath build() {
            return new PipelineMath(attribute, math, name, next);
        }
    }
}
