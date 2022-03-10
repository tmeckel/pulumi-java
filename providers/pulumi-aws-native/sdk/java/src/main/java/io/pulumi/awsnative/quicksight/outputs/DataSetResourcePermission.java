// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DataSetResourcePermission {
    /**
     * <p>The IAM action to grant or revoke permissions on.</p>
     * 
     */
    private final List<String> actions;
    /**
     * <p>The Amazon Resource Name (ARN) of the principal. This can be one of the
     *             following:</p>
     *         <ul>
     *             <li>
     *                 <p>The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)</p>
     *             </li>
     *             <li>
     *                 <p>The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard, template, or theme. (This is common.)</p>
     *             </li>
     *             <li>
     *                 <p>The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight
     *                     ARN. Use this option only to share resources (templates) across AWS accounts.
     *                     (This is less common.) </p>
     *             </li>
     *          </ul>
     * 
     */
    private final String principal;

    @OutputCustomType.Constructor
    private DataSetResourcePermission(
        @OutputCustomType.Parameter("actions") List<String> actions,
        @OutputCustomType.Parameter("principal") String principal) {
        this.actions = actions;
        this.principal = principal;
    }

    /**
     * <p>The IAM action to grant or revoke permissions on.</p>
     * 
    */
    public List<String> getActions() {
        return this.actions;
    }
    /**
     * <p>The Amazon Resource Name (ARN) of the principal. This can be one of the
     *             following:</p>
     *         <ul>
     *             <li>
     *                 <p>The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)</p>
     *             </li>
     *             <li>
     *                 <p>The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard, template, or theme. (This is common.)</p>
     *             </li>
     *             <li>
     *                 <p>The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight
     *                     ARN. Use this option only to share resources (templates) across AWS accounts.
     *                     (This is less common.) </p>
     *             </li>
     *          </ul>
     * 
    */
    public String getPrincipal() {
        return this.principal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetResourcePermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> actions;
        private String principal;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetResourcePermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.principal = defaults.principal;
        }

        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder principal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }
        public DataSetResourcePermission build() {
            return new DataSetResourcePermission(actions, principal);
        }
    }
}
