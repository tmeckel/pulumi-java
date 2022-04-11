// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>An LDAP attribute of an Active Directory computer account, in the form of a name:value pair.</p>
 * 
 */
public final class StudioComponentActiveDirectoryComputerAttributeArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioComponentActiveDirectoryComputerAttributeArgs Empty = new StudioComponentActiveDirectoryComputerAttributeArgs();

    /**
     * <p>The name for the LDAP attribute.</p>
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * <p>The value for the LDAP attribute.</p>
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public StudioComponentActiveDirectoryComputerAttributeArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> value) {
        this.name = name;
        this.value = value;
    }

    private StudioComponentActiveDirectoryComputerAttributeArgs() {
        this.name = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentActiveDirectoryComputerAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentActiveDirectoryComputerAttributeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public StudioComponentActiveDirectoryComputerAttributeArgs build() {
            return new StudioComponentActiveDirectoryComputerAttributeArgs(name, value);
        }
    }
}
