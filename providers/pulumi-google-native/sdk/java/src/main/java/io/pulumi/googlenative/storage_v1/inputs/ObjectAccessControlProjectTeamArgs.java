// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The project team associated with the entity, if any.
 * 
 */
public final class ObjectAccessControlProjectTeamArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectAccessControlProjectTeamArgs Empty = new ObjectAccessControlProjectTeamArgs();

    /**
     * The project number.
     * 
     */
    @InputImport(name="projectNumber")
    private final @Nullable Input<String> projectNumber;

    public Input<String> getProjectNumber() {
        return this.projectNumber == null ? Input.empty() : this.projectNumber;
    }

    /**
     * The team.
     * 
     */
    @InputImport(name="team")
    private final @Nullable Input<String> team;

    public Input<String> getTeam() {
        return this.team == null ? Input.empty() : this.team;
    }

    public ObjectAccessControlProjectTeamArgs(
        @Nullable Input<String> projectNumber,
        @Nullable Input<String> team) {
        this.projectNumber = projectNumber;
        this.team = team;
    }

    private ObjectAccessControlProjectTeamArgs() {
        this.projectNumber = Input.empty();
        this.team = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectAccessControlProjectTeamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> projectNumber;
        private @Nullable Input<String> team;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectAccessControlProjectTeamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectNumber = defaults.projectNumber;
    	      this.team = defaults.team;
        }

        public Builder setProjectNumber(@Nullable Input<String> projectNumber) {
            this.projectNumber = projectNumber;
            return this;
        }

        public Builder setProjectNumber(@Nullable String projectNumber) {
            this.projectNumber = Input.ofNullable(projectNumber);
            return this;
        }

        public Builder setTeam(@Nullable Input<String> team) {
            this.team = team;
            return this;
        }

        public Builder setTeam(@Nullable String team) {
            this.team = Input.ofNullable(team);
            return this;
        }

        public ObjectAccessControlProjectTeamArgs build() {
            return new ObjectAccessControlProjectTeamArgs(projectNumber, team);
        }
    }
}
