import * as React from 'react';
import { NavLink } from 'react-router-dom';
import { Knapp } from 'nav-frontend-knapper';
import { Environment, DeployType } from '../../models/environment';

interface PromoteButtonProps {
    application: string;
    environment: Environment;
    disabled: boolean;
}

function PromoteButton({application, environment, disabled}: PromoteButtonProps) {
    const deployType = environment.deployType;
    const erManuellDeploy = deployType === DeployType.PROMOTE || deployType === DeployType.RELEASE;

    if (environment.promotesTo == null || !erManuellDeploy) {
        return null;
    }

    if (disabled) {
        return <Knapp disabled type="standard">Ingen endringer</Knapp>;
    }

    return (
        <NavLink
            className="knapp"
            to={`/promote/${application}/${environment.name}`}
        >
            Promoter til {environment.promotesTo}
        </NavLink>
    );
}

export default PromoteButton;
