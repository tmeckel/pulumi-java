// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTaskDefinitionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTaskDefinitionArgs Empty = new GetTaskDefinitionArgs();

    /**
     * The family for the latest ACTIVE revision, family and revision (family:revision) for a specific revision in the family, the ARN of the task definition to access to.
     * 
     */
    @Import(name="taskDefinition", required=true)
    private String taskDefinition;

    /**
     * @return The family for the latest ACTIVE revision, family and revision (family:revision) for a specific revision in the family, the ARN of the task definition to access to.
     * 
     */
    public String taskDefinition() {
        return this.taskDefinition;
    }

    private GetTaskDefinitionArgs() {}

    private GetTaskDefinitionArgs(GetTaskDefinitionArgs $) {
        this.taskDefinition = $.taskDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTaskDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTaskDefinitionArgs $;

        public Builder() {
            $ = new GetTaskDefinitionArgs();
        }

        public Builder(GetTaskDefinitionArgs defaults) {
            $ = new GetTaskDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param taskDefinition The family for the latest ACTIVE revision, family and revision (family:revision) for a specific revision in the family, the ARN of the task definition to access to.
         * 
         * @return builder
         * 
         */
        public Builder taskDefinition(String taskDefinition) {
            $.taskDefinition = taskDefinition;
            return this;
        }

        public GetTaskDefinitionArgs build() {
            $.taskDefinition = Objects.requireNonNull($.taskDefinition, "expected parameter 'taskDefinition' to be non-null");
            return $;
        }
    }

}
