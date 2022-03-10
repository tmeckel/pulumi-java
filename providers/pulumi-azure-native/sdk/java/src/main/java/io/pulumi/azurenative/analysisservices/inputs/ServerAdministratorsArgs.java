// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An array of administrator user identities.
 * 
 */
public final class ServerAdministratorsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerAdministratorsArgs Empty = new ServerAdministratorsArgs();

    /**
     * An array of administrator user identities.
     * 
     */
    @InputImport(name="members")
      private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    public ServerAdministratorsArgs(@Nullable Input<List<String>> members) {
        this.members = members;
    }

    private ServerAdministratorsArgs() {
        this.members = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerAdministratorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> members;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerAdministratorsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.members = defaults.members;
        }

        public Builder members(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder members(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
            return this;
        }
        public ServerAdministratorsArgs build() {
            return new ServerAdministratorsArgs(members);
        }
    }
}
