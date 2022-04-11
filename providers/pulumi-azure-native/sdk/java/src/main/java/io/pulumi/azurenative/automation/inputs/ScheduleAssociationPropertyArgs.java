// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The schedule property associated with the entity.
 * 
 */
public final class ScheduleAssociationPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleAssociationPropertyArgs Empty = new ScheduleAssociationPropertyArgs();

    /**
     * Gets or sets the name of the Schedule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public ScheduleAssociationPropertyArgs(@Nullable Output<String> name) {
        this.name = name;
    }

    private ScheduleAssociationPropertyArgs() {
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleAssociationPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleAssociationPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public ScheduleAssociationPropertyArgs build() {
            return new ScheduleAssociationPropertyArgs(name);
        }
    }
}
