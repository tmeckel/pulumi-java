// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudtrail.outputs;

import io.pulumi.aws.cloudtrail.outputs.TrailAdvancedEventSelectorFieldSelector;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TrailAdvancedEventSelector {
    /**
     * Specifies the selector statements in an advanced event selector. Fields documented below.
     * 
     */
    private final List<TrailAdvancedEventSelectorFieldSelector> fieldSelectors;
    /**
     * Specifies the name of the advanced event selector.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor
    private TrailAdvancedEventSelector(
        @OutputCustomType.Parameter("fieldSelectors") List<TrailAdvancedEventSelectorFieldSelector> fieldSelectors,
        @OutputCustomType.Parameter("name") @Nullable String name) {
        this.fieldSelectors = fieldSelectors;
        this.name = name;
    }

    /**
     * Specifies the selector statements in an advanced event selector. Fields documented below.
     * 
    */
    public List<TrailAdvancedEventSelectorFieldSelector> getFieldSelectors() {
        return this.fieldSelectors;
    }
    /**
     * Specifies the name of the advanced event selector.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailAdvancedEventSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TrailAdvancedEventSelectorFieldSelector> fieldSelectors;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailAdvancedEventSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldSelectors = defaults.fieldSelectors;
    	      this.name = defaults.name;
        }

        public Builder fieldSelectors(List<TrailAdvancedEventSelectorFieldSelector> fieldSelectors) {
            this.fieldSelectors = Objects.requireNonNull(fieldSelectors);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public TrailAdvancedEventSelector build() {
            return new TrailAdvancedEventSelector(fieldSelectors, name);
        }
    }
}
