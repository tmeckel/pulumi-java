// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiregistration.k8s.io_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apiregistration.k8s.io_v1.inputs.APIServiceConditionArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * APIServiceStatus contains derived information about an API server
 * 
 */
public final class APIServiceStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final APIServiceStatusArgs Empty = new APIServiceStatusArgs();

    /**
     * Current service state of apiService.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<APIServiceConditionArgs>> conditions;

    /**
     * @return Current service state of apiService.
     * 
     */
    public Optional<Output<List<APIServiceConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    private APIServiceStatusArgs() {}

    private APIServiceStatusArgs(APIServiceStatusArgs $) {
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(APIServiceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private APIServiceStatusArgs $;

        public Builder() {
            $ = new APIServiceStatusArgs();
        }

        public Builder(APIServiceStatusArgs defaults) {
            $ = new APIServiceStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions Current service state of apiService.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<APIServiceConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions Current service state of apiService.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<APIServiceConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions Current service state of apiService.
         * 
         * @return builder
         * 
         */
        public Builder conditions(APIServiceConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public APIServiceStatusArgs build() {
            return $;
        }
    }

}
